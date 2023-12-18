import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		long n=sc.nextLong();
		//String s=sc.next();
		//long[] array=new long[n];
		int sum=0,buff,max=0,min=0;
		//int[] array=new int[l];
		//String s="",m="",h="";

		for(long i=0;i<n;i++) {
			sum+=sc.nextInt()*-1+sc.nextInt()+1;
		}
		//Arrays.sort(array)
		System.out.println(sum);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


