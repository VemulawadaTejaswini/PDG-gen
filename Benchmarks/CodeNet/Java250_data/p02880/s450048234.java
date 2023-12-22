import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int cnt = 0;
		int sum = 0;
		//int cnn = 0;
		int kuku[] = new int[100];
		for(int i=0;i<10;i++) {
			kuku[i]=i;
			for(int k=0;k<10;k++) {
				kuku[k]=k;
				sum = (kuku[i])*(kuku[k]);
				if(sum == N) {
					System.out.println("Yes");
					System.exit(0);
				}else {
					//System.out.println("No");
					//System.exit(0);
					continue;
				}
			}
		}
		//System.out.println(sum);
		  System.out.println("No");
		/*for(int j=0;j<82;j++) {
			cnn = cnn + 1;
		}
		System.out.println(cnn);*/
	}
}