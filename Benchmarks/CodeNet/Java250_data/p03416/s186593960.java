import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		//long[] array=new long[n];
		//String s=sc.next();//,t=sc.next();
		String buff;
		//String[] array = new String[n];
		for(int i=a;i<=b;i++) {
			buff=String.valueOf(i);
			//System.out.println(buff);
			if(buff.charAt(0)==buff.charAt(4)&&buff.charAt(1)==buff.charAt(3))count++;
		}

		System.out.println(count);
	}
	public static int sample(int n) {
		return n;
	}

}
