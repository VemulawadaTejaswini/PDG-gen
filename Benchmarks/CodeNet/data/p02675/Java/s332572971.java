import java.util.*;

public class Main{
	int N;
	Scanner reader = new Scanner(System.in);
	public static void main(String[]args) {
		 Main p = new Main();
		 p.run();
	}

	public void run() {
		N = reader.nextInt();
		if(N%10==3)
			System.out.print("bon");
		if(N%10==0||N%10==1||N%10==6||N%10==8)
			System.out.print("pon");
		else
			System.out.print("hon");
	}
}
