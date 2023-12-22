import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int first = Integer.parseInt(scan.next());
        //int second = Integer.parseInt(scan.next());
        //int third = Integer.parseInt(scan.next());
        //long input = scan.nextLong();
        String s = scan.next();
//        String second = scan.next();
        //for (int i = 1; i <=input; i++) {
        //}
        if(s.equals("SAT"))
            System.out.println("1");
        if(s.equals("SUN"))
            System.out.println("7");
        if(s.equals("MON"))
            System.out.println("6");
        if(s.equals("TUE"))
            System.out.println("5");
        if(s.equals("WED"))
            System.out.println("4");
        if(s.equals("THU"))
            System.out.println("3");
        if(s.equals("FRI"))
            System.out.println("2");
    }    

}
