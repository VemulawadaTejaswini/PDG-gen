import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Hello");
	int q = scan.nextInt();
	String value = scan.next();
	int w = scan.nextInt();
	System.out.println(q);
	System.out.println(value);
	System.out.println(w);
	String add = "+";
	String subtract = "-";
	String multiply = "*";
	String division = "/";
String question = "?";
	int answer = 9;
	while (answer != 5) {
	if (value.equals(add)) {
		System.out.println("true");
		answer = q + w;
	} else if (value.equals(subtract)) {
		answer = q - w;
	}else if (value.equals(multiply)) {
		answer = q * w;
	} else if (value.equals(division)){
		answer = q / w;
	} else if (value.equals(question){
		break;
	}
	System.out.println(answer);
}
}
}

