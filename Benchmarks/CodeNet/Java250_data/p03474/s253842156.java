import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int A=sc.nextInt();
    	int B=sc.nextInt();

    	String str=sc.next();
    	String[] S=str.split("");

    	if(S[A].equals("-")) {

    		int length=str.length();
    		int lengthnum=str.replaceAll("-","").length();

    		int diff=length-lengthnum;

    		if(diff==1) {
    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}

    	}else {
			System.out.println("No");
		}
    }


}

