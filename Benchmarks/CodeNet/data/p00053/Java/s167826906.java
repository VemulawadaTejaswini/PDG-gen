import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while((n = br.read()) != 0){
			if(n > 10000) break;
			int sum = 0;
			boolean soj = true;
			ArrayList<Integer> al = new ArrayList<>();
			al.add(2);
			for(int i = 3; i <= 104729; i++){
				for(int j = 2; j < i; j++){
					if(i % j == 0){
						soj = false;
						break;
					}
				}
				if(soj) al.add(i);
			}
			for(int i = 0; i < n; i++){
				sum += al.get(i);
			}
			System.out.println(sum);
		}
	}
}