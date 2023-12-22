import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int K = Integer.parseInt(line[0]);
        int T = Integer.parseInt(line[1]);
        
        line = br.readLine().split(" ");
        int maxCake = 0;
        for(int i=0;i<T;i++){
        	int cake = Integer.parseInt(line[i]);
        	if(cake>maxCake) maxCake=cake;
        }
        int answer = maxCake - 1 - (K-maxCake);
        //separate by the other cakes
        if(answer>0) System.out.println(answer);
        else  System.out.println(0);
    }
}