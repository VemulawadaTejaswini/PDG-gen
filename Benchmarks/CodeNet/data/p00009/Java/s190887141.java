import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static int primeNum(int n){
		int count = 0;
		
		for(int i = 2; i <= n; i ++){
			if(isThisPrime(i)){
				count ++;
			}
		}
		
		return count;
	}
	
	static boolean isThisPrime(int n){
		if(n != 2 | n % 2 == 0){
			for(int i = 2; i < n; i = i + 1){
				if(n % i == 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	ArrayList<Integer> inNum = new ArrayList<Integer>();
    	
    	while(in.hasNext()){
    		inNum.add(in.nextInt());
       	}
    	
//    	for(int i = 0; i < inNum.size(); i ++){
//    		System.out.println(primeNum(inNum.get(i)));
//    	}
    	
    	in.close();
	}
}