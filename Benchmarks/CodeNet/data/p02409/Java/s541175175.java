import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][][] = new int[4][3][10];
		int i;
		for(i=0;i<n;i++) {
			int b=scan.nextInt()-1;
			int f=scan.nextInt()-1;
			int r=scan.nextInt()-1;
			int v=scan.nextInt();
			a[b][f][r] +=v;
                        if(a[b][f][r]<0) a[b][f][r]=0;
		}
		for(int b=0;b<4;b++) {
			for(int f=0;f<3;f++) {
				for(int r=0;r<10;r++) {
					System.out.printf(" "+ a[b][f][r]);
				}
				System.out.println("");
			}
			if(b<3)
				System.out.println("####################");
			}
		scan.close();
}
}
