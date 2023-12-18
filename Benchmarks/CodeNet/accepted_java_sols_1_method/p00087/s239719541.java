import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");
			
			LinkedList<Double> ll = new LinkedList<Double>(); 
			for (int i = 0; i < nico.length; i++) {
				double r0, r1;
				
				switch(nico[i]) {
				case "+":
					r0 = ll.pop();
					r1 = ll.pop();
					ll.push(r1 + r0);
					break;
					
				case "-":
					r0 = ll.pop();
					r1 = ll.pop();
					ll.push(r1 - r0);
					break;
					
				case "*":
					r0 = ll.pop();
					r1 = ll.pop();
					ll.push(r1 * r0);
					break;
					
				case "/":
					r0 = ll.pop();
					r1 = ll.pop();
					ll.push(r1 / r0);
					break;
					
				default:
					ll.push(Double.parseDouble(nico[i]));
					break;
				}
			}
			System.out.println(ll.pop());
		}
	}
}