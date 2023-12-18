import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] cost = new int [n][3];
        int[][] plans=new int[n][3];
        for(int i=0;i<n;i++){
            plans[i][0]=sc.nextInt();
            plans[i][1]=sc.nextInt();
            plans[i][2]=sc.nextInt();
        }
        
        for (int i=0;i<3;i++)
            cost[0][i]=plans[0][i];
        for (int i=1;i<n;i++)
            for (int j=0;j<3;j++){
                cost[i][j]=plans[i][j]+Math.max(cost[i-1][(j+1)%3],cost[i-1][(j+2)%3]);
            }
        System.out.println(Math.max(cost[n-1][0],Math.max(cost[n-1][1],cost[n-1][2])));
    }
}
