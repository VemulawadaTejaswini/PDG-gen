import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int count = 0;
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
			if(a[i] % 2 != 0){
				System.out.println(count);
				return;
			}else{
				a[i] /= 2;
			}
		}
		count = 1;
		while(true){
			for(int i=0;i<n;i++){
				if(a[i] % 2 != 0){
					System.out.println(count);
					return;
				}else{
					a[i] /= 2;
				}
			}
			count++;
		}
	}

}
