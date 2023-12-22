import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        String ans = judge()? "TBD" : "Heisei";
        System.out.println(ans);
    }
    static boolean judge(){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String y= "", m = "", d = "";
        for(int i = 0; i < 2; i++){
            m += s.charAt(i + 5);
            d += s.charAt(i + 8);
        }
        int month = Integer.parseInt(m), date = Integer.parseInt(d);
        if(month < 4) return false;
        if(month == 4 && date <= 30) return false;
        return true;
    }
}