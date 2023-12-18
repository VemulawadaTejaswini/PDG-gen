import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABProblem{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_str;
		try{
			while((input_str = br.readLine()) != null){
				String[] input_strs = input_str.split(" ");
				int a = Integer.parseInt(input_strs[0]);
				int b = Integer.parseInt(input_strs[1]);
				System.out.println(a + b);
			}
		}catch(Exception e){
			//System.err.println(e);
		}
	}
}