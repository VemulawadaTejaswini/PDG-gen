import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    String[] line = br.readLine().split(" ");
	    int[] data = new int[line.length];

	    for (int i = 0; i < line.length; i++) {
	    	data[i] = Integer.parseInt(line[i]);
	    }

	    StringBuilder sb = new StringBuilder();
	    sb.append(disp(data)).append("\n");

	    for (int i = 1; i <= N - 1; i++) {
	    	int v = data[i];
	    	int j = i - 1;
	    	while (j >= 0 && data[j] > v) {
	    		data[j + 1] = data[j];
	    		j--;
	    	}
	    	data[j + 1] = v;
		    sb.append(disp(data)).append("\n");
	    }
	    System.out.print(sb.toString());
	}

	public static String disp(int[] data) {
	    StringBuilder sb = new StringBuilder();
    	for (int k = 0; k < data.length; k++) {
	    	sb.append(data[k]);
    		if (k != data.length - 1) {
    			sb.append(" ");
    		}
    	}
	    return sb.toString();
	}
}