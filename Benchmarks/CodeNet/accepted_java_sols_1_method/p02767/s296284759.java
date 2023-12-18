import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int buf = 0;
		int buff = 0;
		int buf2 = 0;
		int ans = 1000000;
		int X,i;
		for(i = 0;i < N;i++){
			X = sc.nextInt();
			buf += X;
			buff += X * X;
		}
		for(i = 1;i < 101;i++){
			buf2 = buff + i * ((N * i) - (2 * buf));
			if(ans > buf2){
				ans = buf2;
			}
		}
		System.out.println(ans);
	}	
}