import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n;
        n = sc.nextInt();
        int i,j,k,l;
        int[][][] floor = new int[5][4][11];
        for(i=0;i<5;i++){//配列初期化
            for(j=0;j<4;j++){
                for(k=0;k<11;k++){
                    floor[i][j][k] = 0;
                }
            }
        }
        while(count != n){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            l = sc.nextInt();
            floor[i][j][k] += l;
            count++;
            
        }
        for(i=1;i<5;i++){
            for(j=1;j<4;j++){
                for(k=1;k<11;k++){
                    System.out.printf(" %d",floor[i][j][k]);
                }
                System.out.println();
            }
            if(i<4){
            System.out.println("####################");
        }
    }
        
        
    }
}
