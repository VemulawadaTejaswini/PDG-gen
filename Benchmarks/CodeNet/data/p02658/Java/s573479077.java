import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    String [] info = br.readLine().split(" ");
	    long sum = Long.parseLong(info[0]);
        long mVal = (long)Math.pow(10,18);

	    for(int i = 1; i < N; i++){
            sum*= Long.parseLong(info[i]);
        }
        
        if(sum > mVal){
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
        }
    }
}
