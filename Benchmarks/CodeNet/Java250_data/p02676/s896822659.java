import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int len = scan.nextInt();
		scan.nextLine();
		String topic = scan.nextLine();

		if(topic.length() <= len){
			System.out.println(topic);
		}else{
			System.out.println(topic.substring(0, len) + "...");
		}
		scan.close();
	}
}