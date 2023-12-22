import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		String num;
		int res = 0;
		
		Scanner scanner = new Scanner(System.in);
		num = scanner.next();
		int[] array = new int[100000000];
		for(int i = 0; i < num.length(); i++) {
			array[i] = num.charAt(i)-48;
			res += array[i];
		}
		int valor = Integer.parseInt(num);
		if(valor % res == 0) {
			System.out.println("Yes");
		}else
			System.out.println("No");
	}
}
