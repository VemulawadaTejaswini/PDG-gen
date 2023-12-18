import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
       
        if( k<=a ){
            ans = k;
        }else if( a<k & k<=a+b ){
            ans = a; 
        }else if( a+b<k & k<=a+b+c){
            ans = a - (k-a-b);
        }

        System.out.println( ans );

    }
}