import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();

	int c500 = x/500;
	int c5 = (x%500)/5;

	System.out.print(c500*1000 + c5*5);
    }
}
