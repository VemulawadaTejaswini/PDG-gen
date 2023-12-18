import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int maxa=-1;
        int mina=2001;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(maxa<a[i]){
                maxa=a[i];
            }
            if(mina>a[i]){
                mina=a[i];
            }
        }
        int min=2001;
        for(int i=mina;i<=maxa;i++){
            int max=-1;
            for(int j=0;j<n;j++){
                if(max<Math.abs(i-a[j])){
                    max=Math.abs(i-a[j]);
                }
            }
            if(min>max){
                min=max;
            }
        }
        System.out.println(min);
    }
}
