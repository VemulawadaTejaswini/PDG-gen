import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[3];
		
		num[0]=s.nextInt();
		num[1]=s.nextInt();
		num[2]=s.nextInt();
		int temp;
		if(num[0]>=1 && num[0]<=10000 && num[1]>=1 && num[1]<=10000 && num[2]>=1 && num[2]<=10000) {
		for(int i = 0;i<num.length;i++) {
			for(int j = 1;j<num.length-i;j++) {
				if(num[j-1]>num[j]) {
					temp=num[j-1];
					num[j-1]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.print(num[0]);
		System.out.print(" ");
		System.out.print(num[1]);
		System.out.print(" ");
		System.out.print(num[2]);

	}
	}

}