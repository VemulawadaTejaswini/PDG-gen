import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int[][] cost = new int[n+1][n+1];
        
        for(int i=0;i<=n;i++){
            Arrays.fill(cost[i], 10000);
        }
        
        for(int i=0;i<m;i++){
            String[] str = sc.next().split(",");
            cost[Integer.parseInt(str[0])][Integer.parseInt(str[1])]
                    =Integer.parseInt(str[2]);
            cost[Integer.parseInt(str[1])][Integer.parseInt(str[0])]
                    =Integer.parseInt(str[3]);
        }
        
        String[] str = sc.next().split(",");
        int s = Integer.parseInt(str[0]);
        int g = Integer.parseInt(str[1]);
        int salary = Integer.parseInt(str[2]);  //殿様ァ！
        int daikin = Integer.parseInt(str[3]);  //柱の代金
        
        
        for(int k=1;k<=n;k++){            
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(cost[i][j] >cost[i][k]+cost[k][j]){
                        cost[i][j] = cost[i][k]+cost[k][j];
                    }
                }
            }
        }
        
        System.out.println(salary-daikin-cost[s][g]-cost[g][s]);
        
    }
    
    
}