import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int sx = scan.nextInt();
			int sy = scan.nextInt();
			int tx = scan.nextInt();
			int ty = scan.nextInt();
			
			int Y = ty-sy;
			int X = tx-sx;
			
			StringBuffer sb = new StringBuffer();
			
			char u = 'U';
			char d = 'D';
			char r = 'R';
			char l = 'L';
			
			for(int i = 0;i<Y;i++)sb.append(u);
			for(int i = 0;i<X;i++)sb.append(r);
			for(int i = 0;i<Y;i++)sb.append(d);
			for(int i = 0;i<X;i++)sb.append(l);
			sb.append(l);
			for(int i = 0;i<Y+1;i++)sb.append(u);
			for(int i = 0;i<X+1;i++)sb.append(r);
			sb.append(d);
			sb.append(r);
			for(int i = 0;i<Y+1;i++)sb.append(d);
			for(int i = 0;i<X+1;i++)sb.append(l);
			sb.append(u);
			
			
			System.out.println(sb.toString());
			
			
			
		}
		
		
	}
		

}
