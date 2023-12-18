//Volume1-0104
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//initialization
        String[] s;
        int      x,y,i;
        int [][] map;
        char[][] mat;
        boolean  loop;

        //input
        Scanner sc = new Scanner(System.in);

        while(true){
        	s = sc.nextLine().split("\\s");
        	y = Integer.parseInt(s[0]);
        	x = Integer.parseInt(s[1]);
        	if(x == 0 && y == 0){break;}
        	mat = new char[y][x];
        	map = new int [y][x];
        	for(i=0;i<y;i++){mat[i] = sc.nextLine().toCharArray();}
        	x=0;y=0;
        	loop = false;
        	out:while(true){
        		if(map[y][x] == 1){loop = true; break;}
        		else              {map[y][x] = 1;     }
        		switch (mat[y][x]){
        			case '>' : { x++; break; }
        			case '<' : { x--; break; }
        			case 'v' : { y++; break; }
        			case '^' : { y--; break; }
        			case '.' : { break out;  }
        		}
        	}
        	if(loop){System.out.println("LOOP");     }
        	else    {System.out.println(x + " " + y);}
        }
	}
}