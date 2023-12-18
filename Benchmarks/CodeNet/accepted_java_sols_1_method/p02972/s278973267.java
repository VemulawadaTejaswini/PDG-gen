import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int tmp;
        for(int i=n;i>0;i--){
            tmp=0;
            for(int j=1;j<n/i;j++){
                tmp+=ans[i*(j+1)-1];
            }
            if(tmp%2==nums[i-1]){
                ans[i-1]=0;
            }else{
                ans[i-1]=1;
            }
        }
        int m=0;
        for(int i=0;i<n;i++){
            if(ans[i]==1){
                m++;
            }
        }
        System.out.println(m);
        for(int i=0;i<n;i++){
            if(ans[i]==1){
                System.out.print((i+1)+" ");
            }
        }
        System.out.println();
    }
}
