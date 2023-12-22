import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = 0;
            int[] H = new int[1000];
            int[] W = new int[1000];
            while(true){
                String line = reader.readLine();
                String[] str = line.split(" ");
                H[i] = Integer.parseInt(str[0]);
                W[i] = Integer.parseInt(str[1]);
                if(H[i] == 0 && W[i] == 0){
                    break;
                }
                i++;
            }
            for(int j = 0; j < i; j++){
                for(int k = 0;k < H[j];k++){
                    for(int l = 0; l < W[j]; l++){
                        if((k%2 ==0 && l%2 == 0 )||(k%2 != 0 && l%2 != 0)){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        } catch (IOException e) {
    
        }
    }
   
}
