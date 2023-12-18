import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        //x*x+y*y+z*z+x*y+y*z+z*x
        //(x+y)*(x+y+z)+z*z-x*y
        int n = nextInt();
        int con = 0;
        for(int i=1;i<=n;i++){
            for(int x=1;x<41;x++){
                for(int y=1;y<41;y++){
                    for(int z=1;z<41;z++){
                        //print(x);
                        //print(y);
                        //print(z);
                        if(x*x+y*y+z*z+x*y+y*z+z*x==i){
                            //print(i);
                            con+=1;
                        }
                    }
                }
            }
            print(con);
            con = 0;
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