
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n=scanner.nextInt();
        int[][] graph=new int[n][n];
        for(int i=0;i<n;i++){
            int index=scanner.nextInt();
            int loopCount=scanner.nextInt();
            for(int j=0;j<loopCount;j++){
                graph[index-1][scanner.nextInt()-1]=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]);
                if(j==n-1){
                    System.out.println();
                }else{
                    System.out.print(" ");
                }
            }
        }

    }
}
