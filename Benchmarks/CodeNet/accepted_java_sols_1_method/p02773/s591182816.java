import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int max = 0;
		String[] S = new String[N];
		for(int i = 0;i < N;i++){
			S[i] = sc.next();
		}
		Arrays.sort(S);
		Map<String,Integer> map = new TreeMap<>();
		for(int i = 0;i < N - 1;i++){
			if(S[i + 1].equals(S[i])){
				count++;
				if(i == N - 2){
					map.put(S[i],count);
					max = Math.max(max,count);
				}
			}else{
				map.put(S[i],count);
				max = Math.max(max,count);
				count = 1;
				if(i == N - 2){
					map.put(S[i + 1],count);
					max = Math.max(max,count);
				}
			}
		}
		for(String key : map.keySet()){
			if(map.get(key) == max){
				System.out.println(key);
			}
		}
	}
}