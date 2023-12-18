import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String t= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		int m = sc.nextInt();
		//int k = sc.nextInt();
		//String s=sc.next();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		int[] array = new int[100];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		//Arrays.sort(array);

		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				array[count3]=i*j;
				count3++;
			}
		}
		for(int i=0;i<100;i++) {
			if(array[i]==m) {
				count=1;
				break;
			}
			//System.out.println(array[i]);
		}

		if(count==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

		//System.out.println(buff);
	}
}


