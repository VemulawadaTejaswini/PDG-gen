import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		boolean judge = true;
		int count = 0;
		int so[] = new int[a];
		int Max = 0; int Max2 = 0;
		
		for(int num = 2; num < a; num++){
			for(int i = 2; i < num; i++){
				if(num % i == 0){
					judge = false;
					break;
				}
			}
			if(judge){
				//System.out.print(num + " ");
				so[count] = num;
				count++;
			}
			judge = true;
		}
		

		
		for(int i = 1; i< count; i++){
			int check = so[i-1] + 2;
			if(check == so[i]){
				Max = so[i-1];
				Max2 = so[i];
			}
		}
		System.out.println(Max + " " + Max2);
	}
}