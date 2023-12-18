import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //???????????\???
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);

        //??????
        int[] test = new int[n];

        //2???????????\???
        String[] input2 = br.readLine().split(" ");

        //??????
        for(int a = test.length - 1; 0 < a + 1; a--){
        	test[a] = Integer.parseInt(input2[a]);
        	if(a == 0){
        		System.out.println(test[a]);
        		System.out.println();
        	}else{
            	System.out.println(test[a]);
        	}
        }
	}
}