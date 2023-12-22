import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s ;
        Scanner input =new Scanner(System.in);
        s = input.nextLine();
        if (s.equals("SUN"))
            System.out.println("7");
        else if (s.contains("MON"))
            System.out.println("6");
        else if(s.contains("TUE"))
            System.out.println("5");
        else if(s.contains("WED"))
            System.out.println("4");
        else if(s.contains("THU"))
            System.out.println("3");
        else if(s.contains("FRI"))
            System.out.println("2");
        else
            System.out.println("1");
    }
}
