import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map data = new TreeMap();
//		Set num = new HashSet();
		int[] num = new int[N];
		for(int i = 0 ; i<N; i++){
			int input = sc.nextInt();
			num[i] = input;
		//	num.add(input);
			if(data.containsKey(input)){
				int v = (int)data.get(input);
				data.replace(input, v, v+1);
			}
			else{
				data.put(input, 1);
			}
		}
		Set judge = new HashSet();
		int res = 0;
		for(int i = 0 ; i<N; i++){
			if(judge.contains(num[i]))continue;
			else{
				judge.add(num[i]);
				int add = 0;
				if(data.containsKey(num[i])){
					add+=(int)data.get(num[i]);
				}
				if(data.containsKey(num[i]-1)){
					add+=(int)data.get(num[i]-1);
				}
				if(data.containsKey(num[i]+1)){
					add+=(int)data.get(num[i]+1);
				}
				if(add>res)res = add;
			}
		}
		System.out.println(res);
	}
}
