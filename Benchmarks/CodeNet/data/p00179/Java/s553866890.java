import java.util.*;
public class Main {
	class C {
		int sec;
		String color;
		public C(int sec, String color) {
			this.sec = sec;
			this.color = color;
		}
		
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			if(str.equals("0"))
				break;
			//create a goal
			int len = str.length();
			char [] c = new char[len];
			String [] goal = new String[3];
			for(int i=0; i < len; i++){
				c[i] = 'r';
			}
			goal[0] = new String(c);
			for(int i=0; i < len; i++){
				c[i] = 'g';
			}
			goal[1] = new String(c);
			for(int i=0; i < len; i++){
				c[i] = 'b';
			}
			goal[2] = new String(c);
			//sum of color
			char sumColor = 'r' + 'g' + 'b';
			
			//create a open
			LinkedList<C> open = new LinkedList<C>();
			//create a close
			TreeSet<String> close = new TreeSet<String>();
			
			//set start point
			C startObj = new C(0, str);
			open.add(startObj);
			close.add(str);
			
			boolean flg = false;
			
			while(! open.isEmpty()){
				//pop a first obj
				int nowCost = open.getFirst().sec;
				String nowColor = open.getFirst().color;
				open.removeFirst();
				
				for(int i=0; i < 3; i++){
					if(nowColor.equals(goal[i])){
						flg = true;
						break;
					}
				}
				if(flg){
					System.out.println(nowCost);
					break;
				}
				
				
				//get change way
				for(int i=0; i < nowColor.length() - 1 ; i++){
					char now = nowColor.charAt(i);
					char next = nowColor.charAt(i+1);
					if(now != next){
						//find a diff color
						char diffColor =  (char) (sumColor - now - next);
						//set a color
						StringBuilder sb = new StringBuilder(nowColor);
						sb.setCharAt(i, diffColor);
						sb.setCharAt(i+1, diffColor);
						String newColor = sb.toString();
						
						if(!close.contains(newColor)){
							//add a open
							open.addLast(new C(nowCost + 1, newColor));
							close.add(newColor);
						}
					}
				}
				
			}	
			
			if(!flg){
				System.out.println("NA");
			}
		}
			
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}