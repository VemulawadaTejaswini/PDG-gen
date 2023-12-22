import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		while (true) {
			String line = scan.nextLine();
			String[] elems = line.split(" ");
			int a = Integer.parseInt(elems[0]);
			String op  = elems[1];
			int b = Integer.parseInt(elems[2]);
			if (op.equals("?")) {
				scan.close();
				text.deleteCharAt(text.lastIndexOf("\n"));
				System.out.println(text.toString());
				break;
			} else {
				if(op.equals("+")){
					text.append(a + b).append("\n");
				}else if(op.equals("-")){
					text.append(a - b).append("\n");
				}else if(op.equals("*")){
					text.append(a * b).append("\n");
				}else if(op.equals("/")){
					text.append(a / b).append("\n");
				}
			}
		}
	}
}