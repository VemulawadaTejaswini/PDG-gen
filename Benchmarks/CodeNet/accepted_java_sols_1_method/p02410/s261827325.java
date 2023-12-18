import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] buf = (br.readLine()).split(" ");
		int n = Integer.parseInt(buf[0]);
		int m = Integer.parseInt(buf[1]);
		
		ArrayList<Integer> matrix = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			buf = (br.readLine()).split(" ");
			
			for (int j = 0; j < m; j++) {
				matrix.add(Integer.parseInt(buf[j]));
			}
		}
		
		
		ArrayList<Integer> vector = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int num_element = Integer.parseInt(br.readLine());
			vector.add(num_element);
		}
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 0; j < m; j++) {
				temp += matrix.get(i*m+j) * vector.get(j);
			}
			answer.add(temp);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(answer.get(i));
		}
	}
}