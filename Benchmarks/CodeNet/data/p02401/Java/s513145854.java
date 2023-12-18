import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	int a = stdin.nextInt();
	String op = stdin.nextLine();
	int b = stdin.nextInt();
	int i = 3;
	while(!(op.equals("?"))){
	    if(op.equals("+")){
		System.out.println(a+b);}
	    else if(op.equals("-")){
		System.out.println(a-b);}
	    else if(op.equals("*")){
		System.out.println(a*b);}
	    else if(op.equals("/")){
		System.out.println(a/b);}
	    else{}

	    int a = stdin.nextInt();
	    String op = stdin.nextLine();
	    int b = stdin.nextInt();
	    i = i+3;
	}
    }
}