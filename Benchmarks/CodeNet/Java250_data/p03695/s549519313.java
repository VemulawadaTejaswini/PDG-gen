import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),count=0,sum=0;
		int[] a=new int[8];
		for(int i=0;i<n;i++) {
			int buff=sc.nextInt();
			if(buff<400)a[0]=1;
			else if(buff<800)a[1]=1;
			else if(buff<1200)a[2]=1;
			else if(buff<1600)a[3]=1;
			else if(buff<2000)a[4]=1;
			else if(buff<2400)a[5]=1;
			else if(buff<2800)a[6]=1;
			else if(buff<3200)a[7]=1;
			else count++;
		}
		for(int i=0;i<8;i++)sum+=a[i];
		System.out.println((int)Math.max(sum, 1)+" "+(sum+count));
	}
}

