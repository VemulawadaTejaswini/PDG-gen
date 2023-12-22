import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] lunch=new int[5];
		int[] lunch2=new int[5];

		int sum=0;
		int min=644;

		for(int i=0;i<5;i++) {
			lunch[i]=sc.nextInt();
		}

		for(int i=0;i<5;i++) {
			if(lunch[i]%10==0) {
				lunch2[i]=lunch[i];
			}else {
				lunch2[i]=((lunch[i]/10)+1)*10;
			}
		}

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					sum+=lunch[j];
				}else {
					sum+=lunch2[j];
				}
			}
			//System.out.println(sum);
			if(min>sum) min=sum;
			sum=0;
		}

		System.out.println(min);

		sc.close();

	}
}
