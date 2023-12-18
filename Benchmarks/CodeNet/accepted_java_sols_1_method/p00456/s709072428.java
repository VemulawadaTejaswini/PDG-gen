import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] waseda = new int[10];
		int[] keio = new int[10];
		
		for(int i = 0; i < 10; i++){
			waseda[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++){
			keio[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(waseda);
		Arrays.sort(keio);
		
		int scorew = waseda[9] + waseda[8] + waseda[7];
		int scorek = keio[9] + keio[8] + keio[7];
		
		System.out.println(scorew + " " + scorek);
	}

}