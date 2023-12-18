import java.util.Scanner;
public class Main{
    public static int n;
    public static int s;
    public static int cnt;

    public static void search(int i,int l,int m){
        if(i==n){
            if(l==0){
                cnt+=1;
            }
        }
        if(l<0){
            return;
        }
        for(int o=Math.min(m, 9);o>=0;o--){
            search(i+1,l-o,o-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        s=sc.nextInt();
        while(n!=0 || s!=0){
            cnt=0;
            search(0, s, s);
            System.out.println(cnt);
            n=sc.nextInt();
            s=sc.nextInt();
        }
        sc.close();
    }
}

