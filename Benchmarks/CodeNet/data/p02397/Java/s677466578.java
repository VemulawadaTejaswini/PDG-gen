import java.util.*;

class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int tmp;
		for(int i = 1;;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x <= 0 && y <= 0){
				break;
			}
			else if(x > y){
				tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(x+" "+y);
		}
	}
}
