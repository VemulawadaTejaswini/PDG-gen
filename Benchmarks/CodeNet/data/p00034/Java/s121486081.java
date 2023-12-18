import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			String[] in = stdIn.nextLine().split(",");
			int[] len = new int[10];
			int sumLen = 0;
			for(int i = 0; i < 10; i++) {
				len[i] = Integer.parseInt(in[i])*1000;
				sumLen += len[i];
			}
			double v1 = Integer.parseInt(in[10])/3600.0*1000.0;
			double v2 = Integer.parseInt(in[11])/3600.0*1000.0;
			
			double t = sumLen/(v1 + v2);
			
			double run = v1 * t;
			int length = 0;
			for(int i = 0; i < 10; i++) {
				length += len[i];
				if(length >= run) {
					System.out.println(i+1);
					break;
				}
				
			}
		}
	}
}