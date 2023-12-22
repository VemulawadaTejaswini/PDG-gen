import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int A = Integer.parseInt(str[0]),
            B = Integer.parseInt(str[1]);
        int[] sum = {2*A-1, 2*B-1, A+B};
        int max = sum[0];
        for(int i = 1; i < 3; i++){
            if(max < sum[i]){
                max = sum[i];
            }
        }        
        System.out.println(max);
    }
}