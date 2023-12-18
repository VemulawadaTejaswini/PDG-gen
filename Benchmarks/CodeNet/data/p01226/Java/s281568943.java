import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int times = sc.nextInt();

		for(int i = 1; i <= times; i++){
			int lines = sc.nextInt();
			int xlength = sc.nextInt();
			
			String[] data = new String[lines];
			sc.nextLine();
			for(int j = 0; j < data.length; j++){
				data[j] = sc.nextLine();
			}
			Map mp = new Map(data);

			int inputtimes = sc.nextInt();
			sc.nextLine();
			mp.doCommands(Map.CharsToCommands(sc.nextLine().toCharArray()));

			System.out.println(mp.toString(true));
			if(i != times){
				System.out.println();
			}
		}
	}

}

class Map{
	Elements[][] map;
	
	public Map(String[] data){
		int maxx = 0;
		for(String s : data){
			maxx = Math.max(maxx, s.length());
		}
		
		char[][] m = new char[data.length][maxx];

		for(int i = 0; i < data.length; i++){
			char[] d = data[i].toCharArray();
			m[i] = d;
		}

		map = CharsToElements(m);
	}

	public void doCommands(Commands[] c){
		for(int i = 0; i < c.length; i++){
			doCommands(c[i]);
		}
	}

	public void doCommands(Commands c){
		int[] nowpos = getNowPosition();
		
		switch(c){
			case Up:
				if(nowpos[0] != 0){
					int[] upper = {nowpos[0] - 1, nowpos[1]};
					if(getElement(upper) == Elements.Plain){
						setElement(upper, Elements.TankUp);
						setElement(nowpos, Elements.Plain);
					}else{
						setElement(nowpos, Elements.TankUp);
					}
				}else{
					setElement(nowpos, Elements.TankUp);
				}
				break;
			case Down:
				if(nowpos[0] != map.length - 1){
					int[] lower = {nowpos[0] + 1, nowpos[1]};
					if(getElement(lower) == Elements.Plain){
						setElement(lower, Elements.TankDown);
						setElement(nowpos, Elements.Plain);
					}else{
						setElement(nowpos, Elements.TankDown);
					}
				}else{
					setElement(nowpos, Elements.TankDown);
				}
				break;
			case Left:
				if(nowpos[1] != 0){
					int[] lefter = {nowpos[0], nowpos[1] -1};
					if(getElement(lefter) == Elements.Plain){
						setElement(lefter, Elements.TankLeft);
						setElement(nowpos, Elements.Plain);
					}else{
						setElement(nowpos, Elements.TankLeft);
					}
				}else{
					setElement(nowpos, Elements.TankLeft);
				}
				break;
			case Right:
				if(nowpos[1] != map[nowpos[0]].length - 1){
					int[] righter = {nowpos[0], nowpos[1] + 1};
					if(getElement(righter) == Elements.Plain){
						setElement(righter, Elements.TankRight);
						setElement(nowpos, Elements.Plain);
					}else{
						setElement(nowpos, Elements.TankRight);
					}
				}else{
					setElement(nowpos, Elements.TankRight);
				}
				break;
			case Shoot:
				int lined = 0, xd = 0;
				switch(getElement(nowpos)){
					case TankUp:
						lined = -1;
						break;
					case TankDown:
						lined = 1;
						break;
					case TankLeft:
						xd = -1;
						break;
					case TankRight:
						xd = 1;
						break;
				}
				attack(nowpos, lined, xd);
				break;
		}
		
	}

	void attack(int[] nowpos, int linedir, int xdir){
		int[] nextpos = {nowpos[0] + linedir, nowpos[1] + xdir};

		if(isPostionExist(nextpos)){
			switch(getElement(nextpos)){
				case Plain:
				case Water:
					attack(nextpos, linedir, xdir);
					break;
				case BlickWall:
					setElement(nextpos, Elements.Plain);
					break;
			}
		}
	}

	boolean isPostionExist(int[] p){
		boolean res = true;
		try{
			Elements t = map[p[0]][p[1]];
		}catch(IndexOutOfBoundsException e){
			res = false;
		}finally{
			return res;
		}
	}

	public int[] getNowPosition(){
		int[] res = {-1, -1};
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				if (map[i][j] == Elements.TankUp || map[i][j] == Elements.TankDown || map[i][j] == Elements.TankLeft || map[i][j] == Elements.TankRight){
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}
	
	public Elements getElement(int[] pos){
		return map[pos[0]][pos[1]];
	}
	
	public void setElement(int[] pos, Elements e){
		map[pos[0]][pos[1]] = e;
	}
	public String toString(boolean toMap){
		if(toMap){
			StringBuffer s = new StringBuffer();
			char[][] output = Map.ElementsToChars(map);
			
			for(int i = 0; i < output.length; i++){
				s.append("\n");
				s.append(output[i]);
			}
			
			s.delete(0, 1);

			return s.toString();
		}else{
			return this.toString();
		}
	}
	
//------------------------
	public static enum Elements{
		Plain,
		BlickWall,
		IronWall,
		Water,
		TankUp,
		TankDown,
		TankLeft,
		TankRight,
		IllegalElement;	
	}

	
	public static enum Commands{
		Up,
		Down,
		Left,
		Right,
		Shoot,
		IllegalCommand;
	}

	public static Map.Elements[][] CharsToElements(char[][] c){
		Map.Elements[][] res = new Map.Elements[c.length][];
		for(int i = 0; i < c.length; i++){
			res[i] = new Elements[c[i].length];
			for(int j = 0; j < c[i].length; j++){
				res[i][j] = CharsToElements(c[i][j]);
			}
		}
		return res;
	}
	
	public static Map.Elements CharsToElements(char c){
		Elements res = Map.Elements.IllegalElement;
		
		switch(c){
			case '.':
				res = Elements.Plain;
				break;
			case '*':
				res = Elements.BlickWall;
				break;
			case '#':
				res = Elements.IronWall;
				break;
			case '-':
				res = Elements.Water;
				break;
			case '^':
				res = Elements.TankUp;
				break;
			case 'v':
				res = Elements.TankDown;
				break;
			case '<':
				res = Elements.TankLeft;
				break;
			case '>':
				res = Elements.TankRight;
				break;
			default:
				res = Elements.IllegalElement;
		}

		return res;
	}

	public static char[][] ElementsToChars(Map.Elements[][] e){
		char[][] res = new char[e.length][];
		for(int i = 0; i < e.length; i++){
			res[i] = new char[e[i].length];
			for(int j = 0; j < e[i].length; j++){
				res[i][j] = ElementsToChars(e[i][j]);
			}
		}
		return res;
	}

	public static char ElementsToChars(Map.Elements e){
		char res = 'e';

		switch(e){
			case Plain:
				res = '.';
				break;
			case BlickWall:
				res = '*';
				break;
			case IronWall:
				res = '#';
				break;
			case Water:
				res = '-';
				break;
			case TankUp:
				res = '^';
				break;
			case TankDown:
				res = 'v';
				break;
			case TankLeft:
				res = '<';
				break;
			case TankRight:
				res = '>';
				break;
			case IllegalElement:
				res = 'e';
				break;
		}
		return res;
	}
	
	public static Commands[] CharsToCommands(char[] c){
		Commands[] res = new Commands[c.length];
		
		for(int i = 0; i < c.length; i++){
			res[i] = CharsToCommands(c[i]);
		}
		
		return res;
	}
	
	public static Commands CharsToCommands(char c){
		Commands res = Commands.IllegalCommand;
		
		switch(c){
			case 'U':
				res = Commands.Up;
				break;
			case 'D':
				res = Commands.Down;
				break;
			case 'L':
				res = Commands.Left;
				break;
			case 'R':
				res = Commands.Right;
				break;
			case 'S':
				res = Commands.Shoot;
				break;
			default:
				res =Commands.IllegalCommand;
		}
		return res;
	}
}