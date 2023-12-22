import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	String a=sc.next();
    	String b=sc.next();

    	Integer x=Integer.parseInt(a+b);

    	for(int i=1;i*i<=x;i++) {

    		if(i*i==x) {
    			System.out.println("Yes");
    			return;
    		}
    	}

		System.out.println("No");

    }


}

