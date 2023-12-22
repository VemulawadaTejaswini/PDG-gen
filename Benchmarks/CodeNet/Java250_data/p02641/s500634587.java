import java.util.Scanner;


public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int x = nextInt();
        int n = nextInt();

        if(n==0){
            print(x);
            System.exit(0);
        }

        boolean flag;
        flag = true;
        int[] arr = new int[n];

        int min,min_i,tmp;
        min = 1000;
        min_i = 1000;
        for(int i=0;i<n;i++){
            arr[i] = nextInt();
        }
        for(int a:arr){
            if(x==a){
                flag = false;
            }
        }
        if(flag){
            print(x);
            System.exit(0);
        }

        for(int i=1;i<101;i++){
            flag = true;
            tmp = x-i;
            for(int a:arr){
                if(a!=tmp){
                    flag=true;
                    min = tmp;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                print(min);
                System.exit(0);
            }

            flag = true;
            tmp = x+i;
            for(int a:arr){
                if(a!=tmp){
                    flag=true;
                    min = tmp;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                print(min);
                System.exit(0);
            }

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