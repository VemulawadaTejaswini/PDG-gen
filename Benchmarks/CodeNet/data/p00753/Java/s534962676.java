import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int i=3; i<246912; i=i+2){
			boolean check = true;
			int k=0;
			while(i>=prime.get(k)*prime.get(k)){
				if(i%prime.get(k)==0){
					check = false;
					break;
				}
				k++;
			}
			if(check) prime.add(i);
		}
		while(true){
			int s = 0;
			int e = 0;
			int n = in.nextInt();
			if(n==0) break;
			for(int i=0; prime.get(i)<=n; i++){
				s++;
			}
			e=s;
			for(int i=s; prime.get(i)<=2*n; i++){
				e++;
				if(i==prime.size()-1) break;
			}
			System.out.println(e-s);
		}
	}
}