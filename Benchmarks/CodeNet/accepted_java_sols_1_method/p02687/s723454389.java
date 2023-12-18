import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input S := {ABC|ARC}
        // return ABC or ARC
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equals("ABC")){
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}
