import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int sum = a+b;
			if(a == -1 && b == -1 && c == -1){
				break;
				}
				else if(a == -1 || b == -1){
				System.out.println("F");
				}
				else if(sum >= 80){
				System.out.println("A");
				}
				else if(sum >= 65 && sum < 85){
				System.out.println("B");
				}
				else if(sum >= 50 && sum < 65){
				System.out.println("C");
				}
				else if(sum >= 30 && sum < 50){
					if(c >= 50){
						System.out.println("C");
						}
						else {
						System.out.println("D");
						}
				}	
				else{
				System.out.println("F");
			}
		}
	}
}