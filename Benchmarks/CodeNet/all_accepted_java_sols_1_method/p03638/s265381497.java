import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)nums[i]=sc.nextInt();
        int[][] ans=new int[h][w];
        int nh=0;
        int nw=0;
        int index=0;
        int painted=0;
        while(painted<h*w){
            ans[nh][nw]=index+1;
            nums[index]--;
            if(nums[index]==0)index++;
            painted++;
            if(nh%2==0&&nw<w-1){
                nw++;
            }else if(nh%2==1&&nw!=0){
                nw--;
            }else{
                nh++;
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
}
