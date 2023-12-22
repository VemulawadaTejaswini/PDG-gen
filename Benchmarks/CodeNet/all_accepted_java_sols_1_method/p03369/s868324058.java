import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		line = line.replaceAll("x","");
		System.out.println(700+line.length()*100);
	}

}
