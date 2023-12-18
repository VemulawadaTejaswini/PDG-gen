import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		
		int T = stdIn.nextInt();
		for(int i = 0; i < T; i++){
			String str = stdIn.next();
			int[] data = new int[10];
			for(int j = 0; j < str.length(); j++){
				data[(int)(str.charAt(j)-'0')]++;
			}
			StringBuilder sb = new StringBuilder();
			for(int j = 9; j >= 0; j--){
				while( data[j]-- > 0 ){
					sb.append(Integer.toString(j));
				}
			}
			int max = Integer.parseInt(sb.toString());
			sb.reverse();	
			int min = Integer.parseInt(sb.toString());
			result.add(max-min);
		}
		for(Integer num : result){
			System.out.println(num);
		}
	}
}