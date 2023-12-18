import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] inputs = br.readLine().split(" ");
	int n = Integer.parseInt(inputs[0]);
	int k = Integer.parseInt(inputs[1]);
	int[] w = new int[n];
	int min = 0, maxWeight = 0;
	for (int i = 0; i < n; i++) {
	    w[i] = Integer.parseInt(br.readLine());
	    maxWeight += w[i];
	    if (min < w[i]) {
		min = w[i];
	    }
	}

	int p = 0, sum, cnt;
	while (min != maxWeight) {
	    p = (min + maxWeight) / 2;
	    sum = 0;
	    cnt = 1;
	    for (int i = 0; i < n; i++) {
		if (sum + w[i] > p) {
		    cnt++;
		    sum = w[i];
		} else {
		    sum += w[i];
		}
	    }
	    if (cnt <= k) {
		maxWeight = p;
	    } else {
		min = p + 1;
	    }
	}
	System.out.println(p);
    }
}