import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String t= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		int m = sc.nextInt();
		//int k = sc.nextInt();
		String s=sc.next();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		int[] array = new int[3];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		Arrays.sort(array);
		if(m%2!=0) {
			System.out.println("No");
			System.exit(0);
		}

		for(int i=0;i<s.length()/2;i++) {
			if((char)s.charAt(i)!=(char)s.charAt(i+s.length()/2)) {
				count++;
				//System.out.println((char)s.charAt(i)+" "+(char)s.charAt(i+s.length()/2));
			}
		}

		if(count==0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		//System.out.println(buff);
	}
}


