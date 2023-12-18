import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListOfTop3Hills {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] Hills = new int[10];
		for(int i=0;i<Hills.length;i++){
			Hills[i] = br.read();
		}
		int no1=0;
		int no2=0;
		int no3=0;
		
		for (int i = 0; i < Hills.length; i++) {
			if ((0 < Hills[i]) & (Hills[i] < 10000)) {
				if (no1 < Hills[i]) {
					no3 = no2;
					no2 = no1;
					no1 = Hills[i];
				} else if (no2 < Hills[i]) {
					no3 = no2;
					no2 = Hills[i];
				} else if (no3 < Hills[i]) {
					no3 = Hills[i];
				}
			}
		}

		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
	}
}