import java.util.Scanner;


public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int i = nextInt();
        long[] arr = new long[i];
        long sum = 1L;
        for(int a=0;a<i;a++){
            arr[a] = nextLong();
        }
        try{
            for(long a:arr){
                sum *= a;
            }
            if(sum-1000000000000000000L>0){
                print(-1);
                System.exit(0);
            }
            else{
                print(sum);
            }
        } catch(Exception e){
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