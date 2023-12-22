import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		br.close();
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			nums.add(Integer.parseInt(line[i]));
		}
		Collections.sort(nums);
		
		boolean flg = false;
		for(int i=0;i<n-1;i++) {
			if(nums.get(i).equals(nums.get(i+1))) {
				flg = true;
				break;
			}
		}
		if(flg) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}

}
