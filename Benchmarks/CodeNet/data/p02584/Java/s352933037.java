import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        long x = nextLong();
        long k = nextLong();
        long d = nextLong();

        long k_tmp = k;
        long x_tmp = x;

        long tmp = Math.abs(x);
        while(tmp>0){
            if(x>0) {
                x -=d;
            }
            else{
                x += d;
            }
            tmp = tmp - d;
            k -= 1;
        }
        //print(k);
        if(k<0){
            //print(k_tmp);
            //print(x);
            for(int i = 0;i<k_tmp;i++){
                x_tmp -= d;
            }
            print(Math.abs(x_tmp));
            System.exit(0);
        }
        //print(x);
        if(k%2==0){
            print(Math.abs(x-d));
            System.exit(0);
        }
        else{
            print(Math.abs(x+d));
            System.exit(0);
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