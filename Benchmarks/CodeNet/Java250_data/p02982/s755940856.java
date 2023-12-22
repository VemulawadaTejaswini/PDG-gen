
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[][] nums=new int[n][d];
        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int ans=0;
        int tmp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                tmp=0;
                for(int k=0;k<d;k++){
                    tmp+=Math.pow(Math.abs(nums[i][k]-nums[j][k]),2);
                }
                if(Math.sqrt(tmp)%1==0)ans++;
            }
        }
        System.out.println(ans);
    }
}
