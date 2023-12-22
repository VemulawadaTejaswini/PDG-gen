import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        long D = sc.nextInt();
        int result=0;
        long D2=D*D;
        for(int i=0;i<N;i++){
            long x=sc.nextInt();
            long y=sc.nextInt();
            if(x<=D&&y<=D&&x>=-D&&y>=-D){
                if(x*x+y*y<=D2){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}