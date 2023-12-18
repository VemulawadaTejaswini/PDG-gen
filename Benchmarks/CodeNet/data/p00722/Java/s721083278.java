import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int i=3; i<1000000; i+=2){
			boolean check = true;
			for(int j=0; j<=prime.size() && prime.get(j)*prime.get(j)<=i; j++){
				if(i%prime.get(j) == 0){
					check = false;
					break;
				}
			}
			if(check) prime.add(i);
		}
		
		while(true){
			int a = in.nextInt();
			int d = in.nextInt();
			int n = in.nextInt();
			if((a|d|n)==0) break;
			int count = 0;
			int i=0;
			for(i=a; count<n; i+=d){
				if(prime.contains(i)) count++;
			}
			System.out.println(i-d);
		}
	}
}