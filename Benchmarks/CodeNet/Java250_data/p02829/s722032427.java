import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int ans = 0;
        int p = N+M;
        switch(p){
            case 3:ans=3;break;
            case 5:ans=1;break;
            case 4:ans=2;break;
        }
        System.out.println(ans);
    }
}
