import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws IOException {

		int num = 1;
		int[] nums = new int[10000];
		int cnt = 0;
		for(int j = 0;j < 10000 && num != 0; j++) {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));

			String str= br.readLine();
			num = Integer.parseInt(str);
			if(1 <= num && num <=10000) {
				nums[j] = num;
			}
			j++;
		}

		for(int i=0 ; i<cnt; i++) {
			System.out.println("Case"  +" " + (i+1)  +": " + nums[i]);
		}

	}

}