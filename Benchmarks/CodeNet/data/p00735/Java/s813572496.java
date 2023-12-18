import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner stdIn= new Scanner(System.in);
	static ArrayList<Integer> smPrime = new ArrayList<Integer>();

	public static void main(String args[]){
		while(true){
			int input = stdIn.nextInt();
			if(input==1)
				break;
			func(input);
		}
	}
	static public void func(int in){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(isPrime(in)){
			ans.add(in);
		}
		else{
//			int tmp = in;
//			if(in % 7 == 1){
//				tmp=in-2;
//				if(in % tmp == 0 ){
//					if(isPrime(in/tmp)){
//						ans.add(in/tmp);
//					}
//				}
//			}
			int idxh=0,idxb=0;
			int tmp=6;
			while(tmp*tmp<=in){
				if(in % tmp == 0){
					if(isPrime(tmp)){
						ans.add(idxh++,tmp);
					}
					if(isPrime(in/tmp)){
						ans.add(ans.size()-(idxb++), in/tmp);
					}
				}
				tmp+=2;
				if(in % tmp == 0 ){
					if(isPrime(tmp)){
						ans.add(idxh++,tmp);
					}
					if(isPrime(in/tmp)){
						ans.add(ans.size()-(idxb++), in/tmp);
					}
				}
				tmp+=5;
			}
		}
		System.out.print(in+":");
		for(int i=0;i<ans.size();i++){
			System.out.print(" "+ans.get(i));
		}
		System.out.println();
	}
	private static boolean isPrime(int i) {
		for(int j=0;j<smPrime.size();j++){
			if(i==smPrime.get(j)){
				return true;
			}
		}
		int tmp=6;
		while(tmp*tmp<=i){
			if(i % tmp == 0 )
			{
				return false;
				}
			tmp+=2;
			if(i % tmp == 0 )
			{
				return false;
				}

			tmp+=5;
		}
		smPrime.add(i);
		return true;
	}
}