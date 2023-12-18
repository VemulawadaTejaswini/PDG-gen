import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] fst = (br.readLine()).split(" ");
		int n = Integer.parseInt(fst[0]);
		int quan = Integer.parseInt(fst[1]);
		String[] name = new String[n];
		int[] time = new int[n];
		for (int i = 0; i<n ; i++ ) {
			String[] str = (br.readLine()).split(" ");
			name[i] = str[0];
			time[i] = Integer.parseInt(str[1]);
		}
		// System.out.println(Arrays.toString(name));
		// System.out.println(Arrays.toString(time));
		int sumtime = 0;
		while(time[0] != 0){
			if (time[0] <= quan) {
				sumtime = sumtime + time[0];
				System.out.println(name[0] + " " + sumtime);
				time[0] = 0;
				int workint = time[0];
				String workstr = name[0];
				for (int i = 0; i<n-1 ; i++ ) {
					time[i] = time[i+1];
					name[i] = name[i+1];
				}
				time[n-1] = workint;
				name[n-1] = workstr;
				n--;
			}else{
				sumtime = sumtime + quan;
				time[0] = time[0] - quan;
				int workint = time[0];
				String workstr = name[0];
				for (int i = 0; i<n-1 ; i++ ) {
					time[i] = time[i+1];
					name[i] = name[i+1];
				}
				time[n-1] = workint;
				name[n-1] = workstr;
			}
		}

	}
}