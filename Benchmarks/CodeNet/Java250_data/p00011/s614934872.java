import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int v = Integer.valueOf(br.readLine());
		ArrayList<Integer> amida = new ArrayList<Integer>(v);
		for(int i=0; i<v; i++)
			amida.add(i+1);

		int h = Integer.valueOf(br.readLine());
		
		for(int i=0; i<h; i++){
			String swapInd = br.readLine();
			int swap1 = Integer.valueOf(swapInd.split(",")[0]);
			int swap2 = Integer.valueOf(swapInd.split(",")[1]);
			Collections.swap(amida,swap1-1,swap2-1);
		}

		for(int i=0; i<v; i++)
			System.out.println(amida.get(i));
	}
}