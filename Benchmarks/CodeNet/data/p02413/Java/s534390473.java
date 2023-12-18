import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // c= 縦４行、r = 横５列
        int r = sc.nextInt();
        int c = sc.nextInt();
        int rSum = 0;
        int spreadSheet[][] = new int[r + 1][c + 1];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                spreadSheet[i][j] = sc.nextInt();
                rSum += spreadSheet[i][j];
            spreadSheet[i][c] = rSum;
            }
            rSum = 0;
        }
        int cSum = 0;
        for(int i = 0; i < c + 1; i++){
            for(int j = 0; j < r;j++){
            cSum += spreadSheet[j][i];
            spreadSheet[r][i] = cSum;
                
            }
            cSum = 0;
        }
        
        for(int i = 0; i < r + 1; i++){
            for(int j = 0; j < c + 1; j++){
                if(j != c){
                    System.out.print(spreadSheet[i][j] + " ");
                    
                }else{
                    System.out.print(spreadSheet[i][j]);
                }
            }
            System.out.println();
        }
    }
}

