import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void maain(){

	}

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		//1???????????\????????¢
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        while(true){
        	String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int f = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);

            //?????????????????????
            if(m == -1 && f == -1 && r == -1){
            	return;
            }

            //???????????¨???
            if(m + f < 30 || (m == -1 || f == -1)){
            	System.out.println("F");
            }else if(m + f >= 80){
            	System.out.println("A");
            }else if(m + f >= 65 && m + f <= 80){
            	System.out.println("B");
            }else if(m + f >= 50 && m + f <= 65){
            	System.out.println("C");
            }else if(m + f >= 30 && m + f <= 50){
            	if(r >= 50){
            		System.out.println("C");
            	}else{
                	System.out.println("D");
            	}
            }
        }
	}
}