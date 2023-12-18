
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);
        int[][] AB = new int[M][M];

        for(int i = 0; i < M; i++) {
            line = sc.nextLine();
            lines = line.split(" ");
            int A = Integer.parseInt(lines[0])-1;
            int B = Integer.parseInt(lines[1])-1;
            AB[A][B] = 1;
            AB[B][A] = 1;
        }

//        for(int i = 0; i < M; i++){
//            for(int j = 0; j < M; j++){
//                System.out.print(AB[i][j] + " ");
//            }
//            System.out.println();
//        }

        boolean asnflag = false;
        int[] ans = new int[M];
        for(int i = 1; i < M; i++){
            for(int j = 0; j < M; j++){
                if(AB[i][j] == 1){
                    if(j == 0){
                        asnflag = true;
                        ans[i] = j + 1;
                        break;
                    }
                    if(AB[0][j] == 1){
                        asnflag = true;
                        ans[i] = j + 1;
                        break;
                    }
                }
            }
        }

        if(asnflag){
            System.out.println("Yes");
            for(int i = 0; i < ans.length; i++){
                if(ans[i] != 0) {
                    System.out.println(ans[i]);
                }else{

                }
            }
        }else{
            System.out.println("No");
        }
    }
}
