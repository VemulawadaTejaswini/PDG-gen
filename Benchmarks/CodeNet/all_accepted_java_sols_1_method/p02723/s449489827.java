import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = null;

		s = sc.nextLine();
		String array[] = s.split("");

		if(array[2].equals(array[3]) && array[4].equals(array[5])){
			System.out.println("Yes");
		}else{
				System.out.print("No");
		}
	}
}