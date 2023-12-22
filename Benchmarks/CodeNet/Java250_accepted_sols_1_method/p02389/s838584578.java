import java.util.*;

class Main {
    public static void main( String[] args){
        Scanner sc = new Scanner( System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        if((a<1 || 100<a) || (b<1 || 100<b)){
            System.exit(-1);
        }
        int area = a*b;
        int length = 2*(a+b);
        System.out.println(area+" "+length);
    }
}