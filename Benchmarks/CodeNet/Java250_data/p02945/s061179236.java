import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(max(A+B,A-B,A*B));

    }
    private static int max(int a,int b,int c){
        if(a>=b&&a>=c){
            return a;
        }else if(b>=c){
            return b;
        }else return c;
    }
}

