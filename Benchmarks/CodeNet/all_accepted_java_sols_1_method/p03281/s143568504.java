import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		int m = sc.nextInt();
		//int k = sc.nextInt();
		//String s=sc.next();
		int count=0,flag=0;
		double count1=0,count2=0;
		int count3=0;
		//int[][] array1 = new int[m][k];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		//Arrays.sort(array);

		for(int j=105;j<=m;j++) {
			for(int i=1;i<=j;i+=2) {
				if(j%i==0) {
					count3++;
				}
			}
			//System.out.println(count3);
			if(j%2!=0 && count3==8) {
				count++;
			}
			count3=0;
		}

		/*if(count==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}*/

		System.out.println(count);
	}
}


