import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P=sc.nextInt();
		int Q=sc.nextInt();
		int R=sc.nextInt();
		int[] min= {P,Q,R};
	
	
	if(min[0]>=min[1]) {
		int temp=min[1];
		min[1]=min[0];
		min[0]=temp;
	}
	if(min[1]>=min[2]) {
		int temp=min[2];
		min[2]=min[1];
		min[1]=temp;
	}
	if(min[0]>=min[1]) {
		int temp=min[1];
		min[1]=min[0];
		min[0]=temp;
	}
	System.out.println(min[0]+min[1]);

	}
}

