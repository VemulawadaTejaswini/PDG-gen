import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        String x = s + s;
        boolean b = false;
        for(int ix = 0; ix < s.length(); ix++) {
            for(int ip =0; ip < p.length(); ip++) {
            	b = (x.charAt(ix+ip) == p.charAt(ip));
                if(b == false)
                    break;
            }
            if (b == true)
                break;
        }
        if(b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
