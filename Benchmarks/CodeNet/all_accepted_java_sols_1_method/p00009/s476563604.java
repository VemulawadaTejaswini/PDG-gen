import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        List<Integer> inputList = new ArrayList<Integer>();

        try {
            int max = 0;
            while((input = reader.readLine()) != null) {
                int tmp = Integer.parseInt(input);
                inputList.add(tmp);
                if(tmp > max){
                    max = tmp;
                }
            }
            boolean[] prime = new boolean[max];
            prime[0] = false;
            for(int i=1; i<max; i++){
                prime[i] = true;
            }
            for(int i=1; i<max; i++){
                if(prime[i]){
                    for(int j=i+i+1; j<max; j=j+i+1){
                        prime[j] = false;
                    }
                }
            }
            for(int i=0; i<inputList.size(); i++){
                int count = 0;
                for(int j=0; j<inputList.get(i); j++){
                    if(prime[j]){
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}