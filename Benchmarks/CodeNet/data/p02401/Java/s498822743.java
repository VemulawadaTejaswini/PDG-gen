import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	String add = "+";
	String subtract = "-";
	String multiply = "*";
	String division = "/";
	int answer;
	while (true) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		String value = scan.next();
		int w = scan.nextInt();
	if (value.equals(add)) {
		System.out.println("true");
		answer = q + w;
	} else if (value.equals(subtract)) {
		answer = q - w;
	}else if (value.equals(multiply)) {
		answer = q * w;
	} else if (value.equals(division)){
		answer = q / w;
	} else {
		break;
	}
	System.out.println(answer);
} 
} 
}



