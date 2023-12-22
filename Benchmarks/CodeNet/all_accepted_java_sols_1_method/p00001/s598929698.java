import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1);
		int[] rank3 = {0,0,0};
		int mountain;
		for(int i=0; i<10; i++){
			mountain = Integer.parseInt(r.readLine());
			if(rank3[0] < mountain){
				rank3[2] = rank3[1];
				rank3[1] = rank3[0];
				rank3[0] = mountain;
			}else if(rank3[1] < mountain){
				rank3[2] = rank3[1];
				rank3[1] = mountain;
			}else if(rank3[2] < mountain){
				rank3[2] = mountain;
			}
		}
		for(int i=0; i<3; i++){
			System.out.println(rank3[i]);
		}
	}

}