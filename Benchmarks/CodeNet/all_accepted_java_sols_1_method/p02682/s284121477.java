import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A=sc.nextLong();
		Long B=sc.nextLong();
		Long C=sc.nextLong();
		Long K=sc.nextLong();
		sc.close();
		long point=0l;
		
		if((A>=K)&&K!=0l) {
			point=K;
			K=0l;
		}else {
			point+=A;
			K-=A;
		}
		if((B>=K)) {
			K=0l;
		}else if((B<K)&&K!=0l) {
			K-=B;
		}
		if(K!=0l)
			point-=K;
		System.out.println(point);
	}
}
