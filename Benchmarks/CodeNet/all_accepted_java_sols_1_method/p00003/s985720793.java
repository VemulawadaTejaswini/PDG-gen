import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int [3];
		for(int i = 0;i < n;i++){
			a[0] = in.nextInt();
			a[1] = in.nextInt();
			a[2] = in.nextInt();
			for(int j = 0;j < 3;j++){
				a[j] = a[j] * a[j];
			}
			for(int j = 0;j < 3;j++){
				if(a[j%3] == a[(j+1)%3] + a[(j+2)%3]){
					System.out.println("YES");
					break;
				}else if(j == 2){
					System.out.println("NO");
				}
			}
		}
	}
}