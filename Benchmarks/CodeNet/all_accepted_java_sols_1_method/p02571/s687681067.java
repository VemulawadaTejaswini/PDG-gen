import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char S[] = br.readLine().toCharArray();
	char T[] = br.readLine().toCharArray();
	int roop = S.length - T.length + 1;
	int cnt[] = new int[roop];
	int max = 0;
	for (int i = 0; i < roop; i++) {
	    for (int j = 0; j < T.length; j++) {
		if (T[j] == S[i + j]) {
		    cnt[i]++;
		}
	    }
	}

	for (int k = 0; k < cnt.length; k++) {
	    if (max < cnt[k]) {
		max = cnt[k];
	    }
	}

	System.out.println(T.length - max);
    }
}