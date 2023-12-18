import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");

		while(true){
			int n = stdIn.nextInt();
			String[] sentence = new String[n];
			for(int i=0;i<sentence.length;i++){
				sentence[i] = stdIn.next();
			}
			for(String word:sentence){
				System.out.println(word.replaceAll("Hoshino","Hoshina"));
			}
		}
	}
}