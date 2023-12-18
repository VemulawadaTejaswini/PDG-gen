import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        String s = next();
        String t = next();

        int tmpC = 0;
        int maxC = 0;
        for(int i=0; i<s.length()-t.length()+1; i++){
            for(int j = 0; j<t.length(); j++){
                //print(j);
                //print(i);
                if(s.charAt(i+j) == t.charAt(j)){
                    tmpC += 1;
                }
            }
            //print(maxC);
            maxC = Math.max(tmpC, maxC);
            tmpC = 0;
        }
        print(t.length()-maxC);
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