import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] a = new int [n];
		for (int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		int count = 0;
		int max = 0;
		sc.close();

		for(int i = 0;i < n-1;i++){
				if(a[i] >= a[i+1]){
					count++;
					if(max < count){
						max = count;
					}
				}else {
				count = 0;
			}
		}
System.out.println(max);
	}
}
