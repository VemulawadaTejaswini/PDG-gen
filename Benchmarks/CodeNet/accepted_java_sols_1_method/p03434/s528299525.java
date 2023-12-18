import java.util.*;


class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		List<Integer> A = new ArrayList<Integer>();
		
		
		int numAllice = 0;
		int numBob = 0;
		
		for(int i = 0 ; i < N ; i ++){
			A.add(sc.nextInt());
		}
		
		A.sort(Comparator.reverseOrder());  
		
		for(int i = 0 ; i < A.size() ;i++  ){
			if(i % 2 == 0){
				numAllice = numAllice + A.get(i);
			}else{
				numBob = numBob + A.get(i);;
			}
			
//			System.out.println(i + " " + " " + numAllice + " " + numBob);
			
		}
		
		System.out.println(numAllice - numBob);
	}
}
