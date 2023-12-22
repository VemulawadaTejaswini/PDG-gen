import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int taro = 0;
		int hanako = 0;
		
		for (int i = 0; i < n; i++){
			String str1 = input.next();
			String str2 = input.next();
			
			if (str1.compareTo(str2) > 0) taro += 3;
			else if (str1.compareTo(str2) == 0){
				taro++;
				hanako++;
			}
			else hanako += 3;
		}
		
		System.out.printf("%d %d\n", taro, hanako);
	}
}