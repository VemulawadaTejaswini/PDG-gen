import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			int n = Integer.parseInt(str);
			
			if(n == 0){
				break;
			}
			
			String input = br.readLine();
			
			System.out.println(solve(input));
		}
	}
	
	static String solve(String str){
		int[] vote = new int[26];
		
		String[] strArray = str.split(" ");
		
		for(int i = 0; i < strArray.length; i++){
			vote[(int)(strArray[i].charAt(0) - 'A')]++;
			
			int[] copyVote = Arrays.copyOf(vote, vote.length);
			
			Arrays.sort(copyVote);
			
			//1?????¨2???????????°???????±???????????????????
			if(copyVote[25] == copyVote[24]){
				continue;
			}
			//1?????¨2???????????????????????????????????°???????¢????
			else if(copyVote[25] > copyVote[24] + (strArray.length - i - 1)){
				return (char)(getTop(vote) + 'A')+" "+(i+1);
			}
			
		}
		
		return "TIE";
	}
	
	static int getTop(int[] vote){
		int max = -1;
		int result = -1;
		for(int i = 0; i < vote.length; i++){
			if(max < vote[i]){
				max = vote[i];
				result = i;
			}
		}
		
		return result;
	}

}