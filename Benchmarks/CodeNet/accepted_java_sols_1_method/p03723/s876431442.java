import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c=sc.nextInt();
        int count = 0;
        if(a/2+b/2==c&&b/2+c/2==a&&c/2+a/2==b){
            System.out.println(-1);
        } else {
            while(a%2==0&&b%2==0&&c%2==0){
                int tmpc = a/2+b/2, tmpa = b/2+c/2,tmpb = c/2+a/2;
                a = tmpa;
                b=tmpb;
                c=tmpc;
                count ++;
            }
            System.out.println(count);
        }
    }
}