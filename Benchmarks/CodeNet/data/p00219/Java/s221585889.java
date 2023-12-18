import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int N=cin.nextInt();
			if(N==0)break;
			int a[] = new int[10];
			for(int i = 0;i<N;i++){
				a[cin.nextInt()]++;
			}
			for(int i = 0;i<10;i++){
				for(int j = 0;j<a[i];j++){
					System.out.print("*");
				}
				if(a[i]==0){
					System.out.print("-");
				}
				System.out.println();
			}
		}

	}

}