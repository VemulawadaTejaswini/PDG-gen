import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
	public static void main(String...args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.valueOf(br.readLine());
		int[] result = new int[2];
		for(int i = 0; i < times; i++) {
			String[] animals = br.readLine().split(" ");
    		if(animals[0].compareTo(animals[1]) == 0) {
    			result[0] += 1;
    			result[1] += 1;
    		} else if(animals[0].compareTo(animals[1]) >= 1) {
    			result[0] += 3;
    		} else if(animals[0].compareTo(animals[1]) <= -1) {
    			result[1] += 3;
    		}
		}
		System.out.println(result[0] + " " + result[1]);
	}
}
