import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int NUM = 28;
		final int NUMs = 30;
		HashSet<Integer> h = new HashSet<Integer>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < NUM ;i++){
			h.add(Integer.parseInt(in.readLine()));
		}
		for(int i= 0;i < NUMs ;i++){
			if(!h.contains(i+1)){
				System.out.println(i+1);
			}
		}
	}

}