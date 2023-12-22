import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        Integer []ar=new Integer[n];
        for(int i=0;i<n;i++) {
            ar[i] = in.nextInt();
        }
        long res=0;
        for(int i=0;i<n-1;i++){
            if(ar[i+1]!=0&&ar[i]+ar[i+1]>x){
                res+=((ar[i]+ar[i+1])-x);
                ar[i+1]-=((ar[i]+ar[i+1])-x);
                if(ar[i+1]<0){
                    ar[i]-=Math.abs(ar[i+1]);
                    ar[i+1]=0;
                }
            }
        }
        System.out.println(res);
    }
}
