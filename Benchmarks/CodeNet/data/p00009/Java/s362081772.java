import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		for(int i=3; i<1000000; i=i+2){
			boolean check = true;
			for(int j=0; prime.get(j)*prime.get(j)<=i; j++){
				if(i % prime.get(j)==0){
					check = false;
					break;
				}
			}
			if(check){
				prime.add(i);
			}
		}
		
		while(in.hasNext()){
			int n = in.nextInt();
			int i = 0;
			while(prime.get(i)<=n){
				i++;
			}
			System.out.println(i);
		}
	}
}