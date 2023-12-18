import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int i=3; i<1000000; i=i+2){
			boolean check = true;
			int k=0;
			while(i>=prime.get(k)*prime.get(k)){
				if(i%prime.get(k) == 0){
					check = false;
					break;
				}
				k++;
			}
			if(check) prime.add(i);
		}
		while(in.hasNext()){
			int n = in.nextInt();
			int ans=0;
			for(int i=0; n>=prime.get(i); i++){
				ans++;
				if(i==prime.size()-1) break;
			}
			System.out.println(ans);
		}
	}
}