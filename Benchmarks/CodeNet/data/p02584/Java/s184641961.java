import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		for(int i = 0; i < K; i ++){
			if(X > 0){
				X -= D;
			}else if(X < 0){
				X += D;
			}else if(K % 2 == 0 && X == D){
				break;
			}
		}
		System.out.println(Math.abs(X));
	}
}