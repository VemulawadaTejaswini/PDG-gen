import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //受け取り
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        int[][] index = new int[row][3];
        
        for(int i=0;i<row;i++){
            index[i][0] = sc.nextInt();
            index[i][1] = sc.nextInt();
            index[i][2] = sc.nextInt();
        }
        
        // 初回実行
        int initX = Math.abs(index[0][1]);
        int initY = Math.abs(index[0][2]);
        
        int d = initX + initY;
        
        if(d>index[0][0] || d%2 != index[0][0]%2){
            System.out.println("No");
            System.exit(0);
        }
        
        
        // 以降の実行
        for(int i=1;i<row;i++){
            int x = Math.abs(index[i][1]-index[i-1][1]);
            int y = Math.abs(index[i][2]-index[i-1][2]);
            int distance = x + y;
            int s = index[i][0]-index[i-1][0];
            
            if(distance>s || distance%2 != s%2){
                System.out.println("No");
                System.exit(0);
            }
        }
        
        System.out.println("Yes");
    }
}
