import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
      	if(input.equals("Sunny"))
           System.out.println("Cloudy");
        else if(input.equals("Cloudy"))
                System.out.println("Rainy");
        else
                System.out.println("Sunny");
		
	}
}