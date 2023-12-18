import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			int candyCount = stdIn.nextInt();
			while(candyCount > 39){
				candyCount -= 39;
			}
			System.out.println(String.format("3C%1$02d",candyCount));
		}
	}
}