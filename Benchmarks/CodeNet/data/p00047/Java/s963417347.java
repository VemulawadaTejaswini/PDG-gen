import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String ball = "A";
		while(scan.hasNext()){
			String[] str = scan.nextLine().split(",");
			if(str[0].equals(ball)){
				ball = str[1];
			}else if(str[1].equals(ball)){
				ball = str[0];
			}
		}
		System.out.println(ball);
	}
}