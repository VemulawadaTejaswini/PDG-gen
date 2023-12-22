import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	String data = scan.next();

	for(int i = data.length() - 1; i >= 0; i--){
	    System.out.print(data.charAt(i));
	}

	System.out.println();
    }

}