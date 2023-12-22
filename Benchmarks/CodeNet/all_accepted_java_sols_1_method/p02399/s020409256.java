import java.util.Scanner;


public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	sc.close();
	System.out.printf("%d %d %f\n",(int)x/y, x%y, x/(double)y);
}
}