import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);
        String chithanh = br.readLine();

        String[] chi = chithanh.split(" ");
        int chinm[] = new int[chi.length];
        int tmp;

        for (int i = 0; i < chi.length; i++)
        	chinm[i] = Integer.parseInt(chi[i]);



        for (int j = chinm.length; j > 1; j--) {
        	for (int k = 0; k < j-1; k++) {
        		if (chinm[k] > chinm[k+1]) {
        			tmp = chinm[k];
        			chinm[k] = chinm[k+1];
        			chinm[k+1] = tmp;
        		}
        	}
        }

        for (int l = 0; l < chinm.length; l++) {
        	System.out.print(chinm[l]);
        	if (l != chinm.length-1)
        		System.out.print(" ");
        	else
        		System.out.print("\n");
        }

	}
}