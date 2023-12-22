import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] WeekDAYS = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Scanner obj1=new Scanner(System.in);
        String str = obj1.nextLine();
        if (str.equals("SUN"))
            System.out.println(7);
        else if(str.equals("MON"))
            System.out.println(6);
        else if(str.equals("TUE"))
            System.out.println(5);
        else if(str.equals("WED"))
            System.out.println(4);
        else if(str.equals("THU"))
            System.out.println(3);
        else if(str.equals("FRI"))
            System.out.println(2);
        else if(str.equals("SAT"))
            System.out.println(1);
    }
}