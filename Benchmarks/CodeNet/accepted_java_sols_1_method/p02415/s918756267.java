import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] line = scanner.nextLine().toCharArray();
		for(char a: line)
			if(Character.isLowerCase(a)){
			    	System.out.print(Character.toUpperCase(a));
			}else{
			        System.out.print(Character.toLowerCase(a));
			}
		System.out.println();
	}
}

