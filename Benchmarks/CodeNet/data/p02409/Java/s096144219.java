import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int room[][][] = new int [4][3][10];
        Arrays.fill(room, 0, 0, 0);
        
        for(int i = 0; i < n; i++){
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            room[b - 1][f - 1][r - 1] += v;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    sb.append(" ").append(room[i][j][k]);
                }
                sb.append("\n");
            }
            if(i != 3){
                sb.append("####################").append("\n");
            }
        }
        System.out.print(new String (sb));
    }
}
