import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer a = sc.nextInt();
		Integer rem = n%500;
		if(rem <= a){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}