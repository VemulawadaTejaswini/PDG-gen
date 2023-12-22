import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxI = scanner.nextInt();
		
		for(int i = 0; i < maxI; i ++){
			int a[] = new int[10];
			
			for(int j = 0; j < 10; j ++){
				a[j] = scanner.nextInt();
			}
			int min1 = 0;
			int min2 = 0;
			int j;
			
			for(j = 0; j < 10; j ++){
				if(min1 < a[j])
					min1 = a[j];
				else if(min2 < a[j])
					min2 = a[j];
				else
					break;
			}
			if(j == 10)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}