import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
           int q = Integer.parseInt(reader.readLine());
           int[] S = new int[q];
           int j = 0;
           for(int i = 0; i < q; i++){
               String l =reader.readLine();
               String[] str = l.split(" ");
               if(str[0].equals("0")){
                    S[j] = Integer.parseInt(str[1]);
                    j++;
               }else if(str[0].equals("1")){
                   int t = Integer.parseInt(str[1]);
                    System.out.println(S[t]);
               }else{
                   j--;
               }
           } 
        }catch(IOException e){

        }
    }
}
