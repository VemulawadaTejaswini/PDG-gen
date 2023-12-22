import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	String add = "+";
	String subtract = "-";
	String multiply = "*";
	String division = "/";
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		String value = scan.next();
		int w = scan.nextInt();
	int answer = 20;
	while (true) {
	if (value.equals(add)) {
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
		q = scan.nextInt();
		value = scan.next();
		w = scan.nextInt();
}
} 
}


