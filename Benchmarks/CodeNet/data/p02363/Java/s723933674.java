import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    static final long INF = Long.MAX_VALUE / 10;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int v = Integer.parseInt(sc.next());
        int e = Integer.parseInt(sc.next());
        
        long[][] d = new long[v][v];
        for(int i = 0; i < v; i++){
            Arrays.fill(d[i], INF);
            d[i][i] = 0;
        }
        for(int i = 0; i < e; i++){
            d[Integer.parseInt(sc.next())][Integer.parseInt(sc.next())] = Integer.parseInt(sc.next());
        }
        
        for(int k = 0; k < v; k++){
            for(int i = 0; i < v; i++){
                if(d[i][k] == INF) continue;
                for(int j = 0; j < v; j++){
                    if(d[k][j] == INF) continue;
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        
        boolean negative = false;
        for(int i = 0; i < v; i++){
            if(d[i][i] < 0){
                negative = true;
                break;
            }
        }
        if(negative){
            System.out.println("NEGATIVE CYCLE");
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < v; i++){
                for(int j = 0; j < v; j++){
                    if(d[i][j] == INF){
                        sb.append("INF ");
                    }else{
                        sb.append(d[i][j]).append(" ");
                    }
                }
                sb.deleteCharAt(sb.length()-1);
                sb.append(System.lineSeparator());
            }
            System.out.print(sb);
        }
    }
}
