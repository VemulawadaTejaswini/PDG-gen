import java.util.*;

class Main{
	public static void main (String[] args ){
		int x,y;
		int z = 0;
		Scanner in = new Scanner(System.in);
		while(true){
			x = in.nextInt();
			y = in.nextInt();
			if( x == 0 && y == 0){
				break;
			}else if (x <= y ){
				System.out.println(String.valueOf(x) + ' ' + String.valueOf(y));
			} else {
				System.out.println(String.valueOf(y) + ' ' + String.valueOf(x));
			}
		}
	}
}