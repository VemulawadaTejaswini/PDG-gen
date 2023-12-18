import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Long X = sc.nextLong();
		Long K = sc.nextLong();
		Long D = sc.nextLong();

		if(X < 0){
			X *= -1;
		}

		Long cnt = (long) Math.floor(X/D);

		if(cnt == 0){
			if(K%2==0){
				System.out.println(X);
				return;
			}else{
				System.out.println(Math.abs(X-D));
				return;
			}
		}

		if(K < cnt){
			System.out.println(X-D*K);
			return;
		}
		  
		if((K-cnt)%2==0){
			System.out.println(X-D*cnt);
			return;
		}else{
			System.out.println(Math.abs(X-D*(cnt+1)));
			return;
		}

	}
}
