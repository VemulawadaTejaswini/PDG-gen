import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] tmp = new String[1000];
		int[] point = new int[1000];
		int p = 0;
		while(stdIn.hasNext()) {
			String tmp1 = stdIn.next();
			boolean kk = true;
			for(int i = 0; i < p; i++) {
				if(tmp[i].equals(tmp1)) {
					point[i]++;
					kk = false;
					break;
				}
			}
			if(kk) {
				tmp[p] = tmp1;
				point[p++]++;
			}
		}
		int maxlength = 0;
		int maxlengthid = 0;
		for(int i = 0; i < p; i++) {
			if(maxlength < tmp[i].length()) {
				maxlength = tmp[i].length();
				maxlengthid = i;
			}
		}
		int maxpoint = 0;
		int maxpointid = 0;
		for(int i = 0; i < p; i++) {
			if(maxpoint < point[i]) {
				maxpoint = point[i];
				maxpointid = i;
			}
		}
		System.out.println(tmp[maxpointid] + " " + tmp[maxlengthid]);
		
			
	}
}