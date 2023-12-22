import java.util.*;

public class Main {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int a, b,c,d;
        a = sc.nextInt(); // 高橋体力
        b = sc.nextInt(); // 高橋攻撃
        c = sc.nextInt(); // 青木体力
        d = sc.nextInt(); // 青木攻撃
        for(int i=0;;i++){
            if(i%2==0){
                //高橋が青木攻撃
                c=c-b;
                if(c<=0){
                    System.out.println("Yes");
                    break;
                }
            }else{
                //青木が高橋攻撃
                a=a-d;
                if(a<=0){
                    System.out.println("No");
                    break;
                }

            }
        }

    }
}