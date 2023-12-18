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
        int max=0;
        int sum=0;
        int t;
        String[] s=sc.nextLine().split(" ");
        for(int i=0;i<n;i++){
            t=Integer.parseInt(s[i]);
            sum+=t;
            if(max<t)max=t;
        }
        if(max<2){
            System.out.println("NA");
        }else if(n==1){
            System.out.println(2);
        }else{
            System.out.println(sum-max+1);
        }
    }
}