import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] d = new int[a];
        int ans = 0;
        for(int i=0;i<b;i++){
            int c = scan.nextInt();
            for(int l=0;l<c;l++){
                int e = scan.nextInt();
                d[e-1] +=1;
            }
        }
        for(int l=0;l<a;l++){
            if(d[l]==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
