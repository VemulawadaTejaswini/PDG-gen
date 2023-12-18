import java.util.Scanner;

//Yes, I have a number
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String m = sc.nextLine();
			if(m.equals("END OF INPUT"))break;
			for(String s:m.split(" "))System.out.print(s.length());
			System.out.println();
		}
	}
}