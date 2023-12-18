import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[n][3];
        for(int i=0;i<n-1;i++){
            for(int j=0;j<3;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int time;
        for(int i=0;i<n;i++){
            time=0;
            for(int j=i;j<n-1;j++){
                while((time-nums[j][1])%nums[j][2]!=0||time<nums[j][1]){
                    time++;
                }
                time+=nums[j][0];
            }
            System.out.println(time);
        }
                
    }
}