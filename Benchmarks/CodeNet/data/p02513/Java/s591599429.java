import java.util.Scanner;

//C:Claudia's Mail
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()){
			char[] ch = sc.next().toCharArray();
			boolean n = false;
			boolean e = false;
			for(char c:ch){
				n |= Character.isDigit(c);
				e |= Character.isLowerCase(c)||Character.isUpperCase(c);
			}
			sb.append(n&&e?"_HYBRID":n?"_DIGIT":"_WORD");
		}
		System.out.println(sb);
	}
}