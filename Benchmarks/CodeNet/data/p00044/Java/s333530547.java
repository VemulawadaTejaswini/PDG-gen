import java.util.*;

class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		Prime p = new Prime();
		
		while(true){
			n = sc.nextInt();
			System.out.println(p.getBeforePrime(n)+" "+p.getAfterPrime());
		}
	}
}

class Prime{
	private ArrayList<Integer> prime;
	private int index;
	private boolean f;
	
	Prime(){
		prime = new ArrayList<Integer>();
		setPrime();
	}
	
	public int getBeforePrime(int n){
		index = 0;
		f = false;
		
		for(int i=0;i<prime.size();i++){
			index = i;
			if(n < prime.get(index)){
				break;
			}else if(n == prime.get(index)){
				f = true;
				break;
			}
		}
		
		return prime.get(index-1);
	}
	
	public int getAfterPrime(){
		if(f){
			return prime.get(index+1);
		}
		return prime.get(index);
	}
	
	private void setPrime(){
		int counter = 0;
		int index = 2;
		
		prime.add(2);
		prime.add(3);

		for (int n=5;n<=50021;n+=2) {
			boolean flag = true;
			for (int i=1;prime.get(i)*prime.get(i)<=n;i++) {
				counter +=2;
				if (0 == n%prime.get(i)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				prime.add(n);
				counter++;
			}
		}
		
	}
}