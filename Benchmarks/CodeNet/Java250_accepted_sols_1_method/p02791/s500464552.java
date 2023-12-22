import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int m = sc.nextInt();
		//String s = sc.next();
		long count=1;
		long l=0,x=0;
		//String buff="";
		long[] array=new long[n];

		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		x=array[0];
		for(int i=1;i<n;i++) {
			if(array[i]<=x) {
				count++;
				x=array[i];
			}
		}
		if(count==0) {
			System.out.println(1);
		}else {
			System.out.println(count);
		}
	}
}


