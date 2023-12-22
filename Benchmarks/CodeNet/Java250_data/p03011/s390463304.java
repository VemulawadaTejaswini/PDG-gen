import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int P=sc.nextInt();
		int Q=sc.nextInt();
		int R=sc.nextInt();

		int a=0;
		int b=0;
		if(P <= Q) {
			a=P;
			b=Q;
		}else {
			a=Q;
			b=P;
		}
		if(R <= b) {
			b =R;
		}
		System.out.println(a+b);
		sc.close();
	}


}
