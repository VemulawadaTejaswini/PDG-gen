import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int A=scan.nextInt();
		int B=scan.nextInt();
		int tap=1;
		int n=0;
		if  (tap<B) {
			tap=A;
			n+=1;
		}
		while (tap<B) {
			tap+=A-1;
			n+=1;
		}
		System.out.print(n);
	}

}