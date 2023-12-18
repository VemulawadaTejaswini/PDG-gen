import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);

			if(n == 0 && m == 0){
				break;
			}

			String[] packets = new String[m];
			for(int i = 0; i < m; i++){
				packets[i] = br.readLine();
			}

			System.out.println(solve(n, packets));
		}
	}

	static int solve(int n, String[] input){
		int result = 1;
		boolean infected[] = new boolean[n + 1];

		infected[1] = true;

		Packet[] packets = new Packet[input.length];

		for(int i = 0; i < packets.length; i++){
			packets[i] = new Packet(input[i]);
		}

		Arrays.sort(packets);

		for(int i = 0; i < packets.length; i++){
			Packet p = packets[i];

			if(infected[p.source] &&!infected[p.dest]){
				result++;
				infected[p.dest] = true;
			}
		}

		return result;
	}

}

class Packet implements Comparable<Packet>{
	int time;
	int source;
	int dest;

	public Packet (String str){
		String[] tmpArray = str.split(" ");

		time = Integer.parseInt(tmpArray[0]);
		source = Integer.parseInt(tmpArray[1]);
		dest = Integer.parseInt(tmpArray[2]);

	}

	@Override
	public int compareTo(Packet p) {

		return this.time - p.time;
	}
}