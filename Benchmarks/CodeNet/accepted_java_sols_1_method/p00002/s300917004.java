import java.util.Scanner;

class Main{
	public static void main(String[] a){
		int num1[] = new int[200];
		int num2[] = new int[200];
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			num1[i] = Integer.parseInt(scanner.next());
			num2[i] = Integer.parseInt(scanner.next());
			System.out.println(String.valueOf(num1[i] + num2[i]).length());
			i++;
		}
		
		scanner.close();
	}
}
