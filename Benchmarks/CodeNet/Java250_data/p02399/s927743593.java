import java.util.*;
class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long a00000 = a * 100000;
        long c = a00000 / b;
        long d = c / 100000;
        long f = c % 100000;
        String sf = ""+f;
        while(sf.length() < 5) sf = "0" + sf;
        //System.out.println("" + (a/b) + " " + (a%b) + " " + (a/(double)b));
        System.out.println("" + (a/b) + " " + (a%b) + " " + d + "." + sf);
    }
}