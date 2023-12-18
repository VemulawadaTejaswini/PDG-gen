import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num/1000;
		int num2 = num%1000/100;
		int num3 = num%100/10;
		int num4 = num%10;
		if(num1==num2){
			if(num2==num3){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			if(num2 == num3){
				if(num4==num3){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}
		}
	}

}
