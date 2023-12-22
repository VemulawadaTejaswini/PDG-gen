import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i == 1){
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if(X > Y){
				int tmp;
				tmp = X;
				X = Y;
				Y = tmp;
			}
			if(X == 0 && Y == 0)
				break;
			else
				System.out.println(X +" "+ Y);
		}
		sc.close();
	}
}