import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		String S[]=new String[N];
		int count=0;
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(int i=0;i<N;i++){
			S[i]=scan.next();
			map.put(S[i],1);
		}
		for(Integer val:map.values()){
			count++;
		}
		System.out.println(count);

	}

}
