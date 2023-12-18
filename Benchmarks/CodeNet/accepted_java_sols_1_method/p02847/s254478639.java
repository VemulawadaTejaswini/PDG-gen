import java.util.*;
 
public class Main{
    public static void main(String args[])throws Exception{
        Scanner stdin = new Scanner(System.in);
 
        String S = stdin.next();
 
        if(S.equals("SUN")){
            System.out.print("7");
        }
        else if(S.equals("MON")){
            System.out.print("6");
        }
        else if(S.equals("TUE")){
            System.out.print("5");
        }
        else if(S.equals("WED")){
            System.out.print("4");
        }
        else if(S.equals("THU")){
            System.out.print("3");
        }
        else if(S.equals("FRI")){
            System.out.print("2");
        }
        else if(S.equals("SAT")){
            System.out.print("1");
        }
    }
}