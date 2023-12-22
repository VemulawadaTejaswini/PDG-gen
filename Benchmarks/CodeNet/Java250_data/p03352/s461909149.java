import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//, n = sc.nextInt();
		int sum=0,count=1,flag=0,max=-999999,min=99999;
		int[] array=new int[10000];
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		array[0]=1;
		String buff1,buff2;
		for(int i=2;i<=31;i++) {
			for(int j=2;j<=10;j++) {
				if(Math.pow(i,j)>n)break;
				array[count]=(int) Math.pow(i, j);
			}
			count++;
		}
		Arrays.sort(array);
		for(int i=9999;i>=0;i--) {
			if(array[i]<=n) {
				System.out.println(array[i]);
				break;
			}
		}
	}
	public static int sample(int n) {
		return n;
	}

}
