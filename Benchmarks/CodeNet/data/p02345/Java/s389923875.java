import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    static int[] A = new int[100000];
    static int[] B = new int[101];

    static void update(int i, int x){
        A[i] = x;
        B[i/1000] = Math.min(x, B[i/1000]);
    }
     
    static void find(int s, int t){
        int min = Integer.MAX_VALUE;
        if (s/1000 == t/1000 || s/1000 + 1 == t/1000){
            for (int i = s; i < t + 1; i++){
                if (A[i] < min){
                    min = A[i];
                }
            }            
            System.out.println(min);
        }else{
            //left range
            for (int i = s; i < (s/1000 +1)*1000; i++){
                if (A[i] < min){
                    min = A[i];
                }
            }

            for (int j = s/1000 + 1; j < t/1000; j++){
                if (B[j] < min){
                    min = B[j];
                }
            }   
            //right range
            for (int i = (t/1000) * 1000; i < t + 1; i++){
                if (A[i] < min){
                    min = A[i];
                }
            }
            System.out.println(min);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);
        for (int i = 0; i < 100000; i++){
            A[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < 101; i++){
            B[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < q; i++){
            String[] ln = br.readLine().split(" ");
            int com = Integer.parseInt(ln[0]);
            int x = Integer.parseInt(ln[1]);
            int y = Integer.parseInt(ln[2]);
            if (com == 0){
                update(x,y);
            }else{
                find(x,y);
            }
        }
    }
}    