import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bloodType;
		int type[] = new int [4];
		while ((bloodType = br.readLine()) != null){
			String i[] = bloodType.split(",");
			if (i[1].equals("A")){
				type[0]++;
			}else if (i[1].equals("B")){
				type[1]++;
			}else if (i[1].equals("AB")){
				type[2]++;
			}else if (i[1].equals("O")){
				type[3]++;
			}
		}
		  for(int j = 0 ; j < 4 ; j++){
			  System.out.println(type[j]);
		  }

	}

}