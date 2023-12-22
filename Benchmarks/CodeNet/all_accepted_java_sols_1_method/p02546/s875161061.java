import java.util.*;
class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int p = s.length();
        if(s.charAt(p-1)=='s')
            System.out.println(s+"es");
        else
            System.out.println(s+"s");
    }
}
