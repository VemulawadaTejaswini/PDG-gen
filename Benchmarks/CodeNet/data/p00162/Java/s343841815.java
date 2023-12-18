import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        String string;
        int count;
         
        boolean hamming[] = new boolean[1000001]; hamming[1] = true;
        int num[] = new int[]{2, 3, 5};
        for(int i = 0; i < 3; i++){
            for(int j = 1; j * num[i] < 1000001; j++){
                if(hamming[j * num[i]]) continue;
                if(j * num[i] % num[i] == 0 && hamming[j * num[i] / num[i]])
                    hamming[j * num[i]] = true;
            }
        }
         
        while(!(string = reader.readLine()).equals("0")){
            count = 0;
            for(int i = Integer.valueOf(string.split(" ")[0]);
                    i <= Integer.valueOf(string.split(" ")[1]); i++){
                if(hamming[i]) count++;
            }
            System.out.println(count);
        }
        reader.close();
    }
}