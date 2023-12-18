import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main{
  public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] ls = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ls2 = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < ls[1]; i++){
            ls[0] -= ls2[i];
            if(ls[0] < 0)
                break;
        }
        
        System.out.println(ls[0] < 0 ? -1 : ls[0]);
    }
}