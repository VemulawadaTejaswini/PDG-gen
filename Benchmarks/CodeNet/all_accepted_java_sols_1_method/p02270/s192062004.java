import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] w=new int[n];
        int max=0;
        int acc=0;
        for (int i=0;i<n;i++) {
            w[i]=sc.nextInt();
            acc+=w[i];
            max=Math.max(max,w[i]);
        }
        int left=max;
        int right=acc;
        while(left<right){
            int p=(left+right)/2;
            int id=0;
            int sum=0;
            for (int i=0;i<n;i++){
                if(sum+w[i]>p){
                    sum=w[i];
                    id++;
                }else{
                    sum+=w[i];
                }
                if(id==k){
                    break;
                }
            }
            if(id==k){
                left = p+1;
            }else{
                right = p;
            }
        }
        System.out.println(left);
    }
}
