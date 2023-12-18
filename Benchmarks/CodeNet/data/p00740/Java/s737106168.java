import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] s = new int[n];
            int c = 0; //???????????£??????????????°
            int ans = -1;
            if(n==0 && p==0) break;
            for(int i = 0; i < n; i++)
                s[i] = 0;
            for(;;){
                for(int i = 0; i < n; i++){
                    if(p!=0){
                        if(s[i]==0) c++;
                        s[i]++;
                        p--;
                    }else{
                        if(c==1){
                            ans = i==0 ? n-1 : i-1;
                            break;
                        }else{
                            p = s[i];
                            if(s[i]!=0){
                                s[i] = 0;
                                c--;
                            }
                        }
                    }
                    // System.out.println("s[" + i + "]:" + s[i]);
                    // System.out.println("c = " + c);
                }
                if(ans!=-1) break;
            }
            System.out.println(ans);
        }
    }
}