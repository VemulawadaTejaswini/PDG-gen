import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count0 = 0,count2 = 0,count4 = 0;
		for(int i=0;i<n;i++){
			int a = scanner.nextInt();
			if(a % 2 == 0){
				a /= 2;
				if(a % 2 == 0){
					count4++;
				}else{
					count2++;
				}
			}else{
				count0++;
			}
		}
		if(count4 + 1 < count0){
			System.out.println("No");
		}else{
			if(count2 % 2 != 0){
				if(count4 < count0){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			}else{
				System.out.println("Yes");
			}
		}
	}

}
