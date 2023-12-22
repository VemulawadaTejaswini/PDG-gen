import java.io.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		stdin.readLine();
		int[] elems = Stream.of(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int count = 0;
		while(true) {
			for(int i = 0; i < elems.length; i++) {	
				if(elems[i] % 2 == 0) {
					elems[i] /= 2;
				}else {
					System.out.println(count);
					return;
				}
			}
			count++;
		}
	}
}