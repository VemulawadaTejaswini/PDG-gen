import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String[] cd = vd.readLine().split(" ");
		vd.close();
		int[] lo = new int[cd.length];
		for(int i=0; i<cd.length; i++) lo[i] = Integer.parseInt(cd[i]);
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<cd.length;++i) {
			if(max<lo[i]) max=lo[i];
			if(min>lo[i]) min=lo[i];
		}
		System.out.println(max-min);
	}

}
