import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		String line;
		String[] imperative;
		str.append(scan.nextLine());
		for (int i = 0; i < Integer.parseInt(scan.nextLine()); i++) {
			line = scan.nextLine();
			imperative = line.split(" ");
			switch (imperative[0]) {
			case "print":
				str.substring(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]));
			case "reverse":
				str.replace(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]), str.substring(0, 3));
			case "replace":
				str.replace(Integer.parseInt(imperative[1]), Integer.parseInt(imperative[2]), imperative[3]);
			}
		}
	}
	
}