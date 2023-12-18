import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N=Integer.parseInt(sc.nextLine());
        for(int i=0;i<N;i++){
            run();
        }
    }
    static void run(){
        String[] s = sc.nextLine().split(" ");
        int x=Integer.parseInt(s[0]);
        int y=Integer.parseInt(s[1]);
        int b=Integer.parseInt(s[2]);
        int p=Integer.parseInt(s[3]);
        int ans=b*x+y*p;
        if(b>4&&p>1){
            x=x*4/5;
            y=y*4/5;
            ans=b*x+y*p;
        }else{
            if(b<4)b=4;
            if(p<2)p=2;
            int a=(b*x+y*p)*4/5;
            if(ans>a)ans=a;
        }
        System.out.println(ans);
    }
}