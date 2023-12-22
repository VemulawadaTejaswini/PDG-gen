import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
        int i =1;
        int a = stdin.nextInt();
	while(a!=0){
	    System.out.println("Case "+i+":"+" "+a);
	    i++;
	    a = stdin.nextInt();
	    }
    }
}