import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	String input=scanner.next();

    	int first =input.indexOf("A");
    	int last=input.lastIndexOf("Z");


    	int result=last-first+1;
    	
    	System.out.println(result);

    	scanner.close();


    }

}