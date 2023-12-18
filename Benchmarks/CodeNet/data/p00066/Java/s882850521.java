import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			char[] b = stdIn.next().toCharArray();
			if((b[0]==b[1]&&b[1]==b[2])||
					(b[0]==b[3]&&b[3]==b[6])||
					(b[0]==b[4]&&b[4]==b[8])){
				System.out.println(b[0]);
			}
			else if((b[3]==b[4]&&b[4]==b[5])||
					(b[1]==b[4]&&b[4]==b[7])||
					(b[2]==b[4]&&b[4]==b[6])){
				System.out.println(b[4]);
			}
			else if((b[6]==b[7]&&b[7]==b[8])||
					(b[2]==b[5]&&b[5]==b[8])){
				System.out.println(b[8]);
			}
			else{
				System.out.println("d");
			}
		}
	}
}