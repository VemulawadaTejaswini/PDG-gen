import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc 	= new Scanner(System.in);
		int seconds	= Integer.parseInt(sc.next());
		
		int answerHours   = seconds / (60 * 60);
		int answerMinites = (seconds - answerHours * (60 * 60)) / 60;
		int answerSeconds = seconds - (answerHours * (60 * 60)) - answerMinites * 60;
		
		System.out.println(answerHours + ":" + answerMinites +":" + answerSeconds);
		
		sc.close();
	}
}

