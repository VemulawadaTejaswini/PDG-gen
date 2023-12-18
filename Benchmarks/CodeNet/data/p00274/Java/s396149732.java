import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            int n=Integer.parseInt(sc.nextLine());
            if(n==0)break;
            run(n);
        }
    }
    static void run(int n){
        int ans=1;
        int max=0;
        int t;
        String[] s=sc.nextLine().split(" ");
        for(int i=0;i<n;i++){
            t=Integer.parseInt(s[i]);
            if(max<t)max=t;
            if(t>0)ans++;
        }
        if(max<2){
            System.out.println("NA");
        }else{
            System.out.println(ans);
        }
    }
}