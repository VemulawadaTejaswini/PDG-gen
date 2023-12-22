import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String srt=sc.nextLine();
			String srt2="AAA";
			String srt3="BBB";
			if(srt.equals(srt2)||srt.equals(srt3)){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
	}
