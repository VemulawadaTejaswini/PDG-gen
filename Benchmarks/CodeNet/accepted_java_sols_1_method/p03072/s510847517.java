import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(bf.readLine());
        int[] H = new int[N];
        String[] str = bf.readLine().split(" ");
        for(int i = 0; i < N; i++){
            H[i] = Integer.parseInt(str[i]);
        }
        int num = 1;
        loop: for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(H[i] < H[j]){
                    continue loop;
                }
            }
            num++;
        }
        System.out.println(num);
    }
}