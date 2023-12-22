import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();
	int price = 700;

	if(s.charAt(0) == 'o')price += 100;
	if(s.charAt(1) == 'o')price += 100;
	if(s.charAt(2) == 'o')price += 100;

	System.out.println(price);
    }
}
