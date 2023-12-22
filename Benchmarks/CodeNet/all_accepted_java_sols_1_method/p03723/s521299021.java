import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a==b&&b==c){
            if(a%2==0){
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        } else {
            long ans = 0;
            while(a%2==0&&b%2==0&&c%2==0){
                int tmpA = a,tmpB=b,tmpC =c;
                a = (tmpB+tmpC)/2;
                b = (tmpA+tmpC)/2;
                c = (tmpA+tmpB)/2;
                ans ++;
            }
            System.out.println(ans);
        }
    }
}
