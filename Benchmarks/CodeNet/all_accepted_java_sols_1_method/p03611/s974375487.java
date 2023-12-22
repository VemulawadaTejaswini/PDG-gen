import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		Map<Integer,Integer> data=new HashMap<Integer,Integer>();

		for(int i=0;i<n;i++) {

			int buf=sc.nextInt();

			if(data.containsKey(buf)) {
				data.put(buf,data.get(buf)+1);
			}else {
				data.put(buf,1);
			}

		}

		int ans=0;

		for(int key:data.keySet()) {

			int counter=0;

			for(int i=key-1;i<=key+1;i++) {
				//-1 0 1
				//着目してるキーより一つ少ない、着目してるキー、着目してるキーより一つ多い

					if(data.containsKey(i)) counter+=data.get(i);
			}

			//比較して更新していく。

			ans=Math.max(ans,counter);

		}

		System.out.println(ans);

	}


}
