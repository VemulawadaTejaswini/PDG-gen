import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] SArray = S.split("");
		if(SArray[0].equals(SArray[1])) {
			System.out.println("Bad");
			}else if(SArray[1].equals(SArray[2])) {
					System.out.println("Bad");
				}else if(SArray[2].equals(SArray[3])) {
					System.out.println("Bad");
				}else {
					System.out.println("Good");
				}
		}

}