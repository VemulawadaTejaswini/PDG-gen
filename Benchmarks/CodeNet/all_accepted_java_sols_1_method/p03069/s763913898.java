import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()),
            count = 0;
        String[] S = bf.readLine().split("");
        for(int i = 0; i < N; i++){
            if(S[i].equals(".")){
                count++;
            }
        }
        int min = count;
        for(int i = 0; i < N && 0 < min; i++){
            if(S[i].equals("#")){
                count++;
            } else{
                count--;
                if(count < min){
                    min = count;
                }
            }            
        }           
        System.out.println(min);
    }
}