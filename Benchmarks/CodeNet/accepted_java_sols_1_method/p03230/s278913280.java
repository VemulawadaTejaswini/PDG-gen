import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Integer,Integer> ntoi = new HashMap<>();
        int in = 2;
        while(true){
            int combi = in*(in-1)/2;
            if(combi > 100000){
                break;
            }
            ntoi.put(combi, in);
            in ++;
        }

        if(ntoi.containsKey(N)){
            System.out.println("Yes");
            System.out.println(ntoi.get(N));
            int[][] table = new int[N+1][ntoi.get(N)+1];
            int i=1;
            int j=2;
            int k=1;
            while(k <= N) {
                table[k][i] = 1;
                table[k][j] = 1;
                if(j+1 <= ntoi.get(N)){
                    j++;
                }else{
                    i++;
                    j = i+1;
                }
                k++;
            }
            for (int c = 1; c <= ntoi.get(N); c++) {
                System.out.print(ntoi.get(N)-1);
                System.out.print(" ");
                for(int r=1; r<=N; r++){
                    if(table[r][c]==1){
                        System.out.print(r);
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.println("No");
        }
    }
}
