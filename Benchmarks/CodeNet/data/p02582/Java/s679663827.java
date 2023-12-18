import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int con = 0;
        String s = next();
        if(s.charAt(0)=='R'){
            if(s.charAt(1)=='R'){
                con = 2;
                if(s.charAt(2)=='R'){
                    con = 3;
                    print(con);
                    System.exit(0);
                }
                else {
                    print(con);
                    System.exit(0);
                }
            }
            else{
                print(0);
                System.exit(0);
            }
        }
        else {
            if (s.charAt(1)=='R'){
                if(s.charAt(2)=='R'){
                    con = 2;
                    print(con);
                    System.exit(0);
                }
                else{
                    print(0);
                    System.exit(0);
                }
            }
            else print(0);
        }
    }


    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }

    //print
    public static void print(Object a){
        System.out.println(a);
    }


    //gcd
    public static int gcd (int a, int b){
        int tmp;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return b;
    }


    //lcm
    public static int lcm(int a,int b){
        int tmp;
        long c = a;
        c *= b;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return (int)(c/b);
    }
}