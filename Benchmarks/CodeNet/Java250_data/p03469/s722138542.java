import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String S=sc.next();



    	System.out.println(S.replaceAll("2017", "2018"));
    }

}





