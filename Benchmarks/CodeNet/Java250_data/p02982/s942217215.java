import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		int m = sc.nextInt();
		int k = sc.nextInt();
		//String s=sc.next();
		double count=1,flag=0;
		double count1=0,count2=0;
		int count3=9999999;
		int[][] array1 = new int[m][k];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		//Arrays.sort(array);

		for(int i=0;i<m;i++) {
			for(int j=0;j<k;j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m-1;i++) {
			for(int j=i+1;j<m;j++) {
				for(int g=0;g<k;g++) {
					count2+=Math.pow((array1[i][g]-array1[j][g]), 2);
				}
				count=Math.sqrt(count2);
				count3=(int)count;
				//System.out.println(count2);
				if(count-count3==0) {
					count1++;
				}
				count2=0;
			}
		}

		/*if(count==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}*/

		System.out.println((int)count1);
	}
}


