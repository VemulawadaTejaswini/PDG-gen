import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int oneyen=1*sc.nextInt();
        int fiveyen=5*sc.nextInt();
        int tenyen=10*sc.nextInt();
        int fiftyyen=50*sc.nextInt();
        int onehundredyen=100*sc.nextInt();
        int fivehundredyen=500*sc.nextInt();

        if (oneyen+fiveyen+tenyen+fiftyyen+onehundredyen+fivehundredyen>=1000){
            System.out.println(1);
        }else System.out.println(0);
    }
}