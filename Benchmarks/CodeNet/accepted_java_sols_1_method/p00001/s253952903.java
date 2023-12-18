import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] mountain=new int[10];
        for(int i=0;i<10;i++){
            mountain[i]=Integer.parseInt(br.readLine());
        }Arrays.sort(mountain);
        for(int i=0;i<3;i++){
            System.out.println(mountain[mountain.length-i-1]);
        }
    }
    
}