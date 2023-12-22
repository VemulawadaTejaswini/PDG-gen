import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
	    String S = sc.next();

		for(int i=0; i<4; i++){
			if(S.substring(i,i+1).equals("+")) answer++;
			if(S.substring(i,i+1).equals("-")) answer--;
		}
		
		

		sc.close();

	    System.out.println(answer);
    }
}
