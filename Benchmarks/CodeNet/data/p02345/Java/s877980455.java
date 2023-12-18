import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] A = new int[100000];
    static int[] B = new int[100];
    static void update(int i, int x){
        A[i] = x;
        int b_index = i%1000;
        if (A[i] < B[b_index]){
            B[b_index] = A[i];
        }
    }
    static int find(int s, int t){
        int b_left_index = s%1000 + 1;
        int b_right_index = t%1000 - 1;
        int min_leftA = Integer.MAX_VALUE;
        int min_rightA = Integer.MAX_VALUE;
        int min_B = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        if (t<1000){
            return find2(s,t);
        }
        for (int i = s; i < b_left_index*1000+1; i++){
            if (A[i] < min_leftA){
                min_leftA = A[i];
            }
        }
        for (int i = b_left_index; i < b_right_index; i++){
            if (B[i] < min_B){
                min_B = B[i];
            }
        }        
        for (int i = (b_right_index+1)*1000; i < t; i++){
            if (A[i] < min_rightA){
                min_rightA = A[i];
            }
        }
        
        if (min_leftA < min){
            min = min_leftA;
        }
        if (min_B < min){
            min = min_B;
        }
        if (min_rightA < min){
            min = min_rightA;
        }
        return min;
    }
    static int find2(int s, int t){
        int min = Integer.MAX_VALUE;
        for (int i = s; i < t + 1; i++){
            if (A[i] < min){
                min = A[i];
            }
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);
        for (int j = 0; j < 100000; j++){
            A[j] = Integer.MAX_VALUE;
        }
        for (int j = 0; j < 100; j++){
            B[j] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < q; i++){
            String[] ln = br.readLine().split(" ");
            int com = Integer.parseInt(ln[0]);
            int x = Integer.parseInt(ln[1]);
            int y = Integer.parseInt(ln[2]);
            if (com == 0){
                update(x,y);
            }else{
                System.out.println(find(x,y));
            }
        }
    }
}    