import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str =sc.nextLine();
			String[] stra = str.split(" ");
			System.out.println(Integer.parseInt(stra[0]) + Integer.parseInt(stra[1]));
		}
		sc.close();
		
	}

}