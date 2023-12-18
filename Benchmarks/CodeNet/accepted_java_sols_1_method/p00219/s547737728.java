import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0)break;
			int a[] = new int [10];
			for(int i = 0;i < n;i++){
				int num = in.nextInt();
				a[num]++;
			}
			for(int i = 0;i < 10;i++){
				if(a[i] == 0){
					System.out.println("-");
				}else{
					for(int j = 0;j < a[i];j++){
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}