
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cup = "A";
		while(sc.hasNext()){
			String[] c = sc.next().split(",");
			if(c[0].equals(cup)){
				cup = c[1];
			}else if(c[1].equals(cup)){
				cup = c[0];
			}
		}
		System.out.println(cup);
	}

}