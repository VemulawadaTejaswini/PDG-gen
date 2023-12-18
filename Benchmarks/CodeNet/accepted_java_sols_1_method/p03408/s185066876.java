import java.util.*;


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] s = new String[ N ];
		for(int i = 0 ; i < N ; i++){
			s[i] = sc.next();
		}
		
		int M = sc.nextInt();
		String[] t = new String[ M ];
		for(int i = 0 ; i < M ; i++){
			t[i] = sc.next();
		}
		
		int countMax = 0 ;
		for(int k = 0 ; k < N + M ; k ++){
			
			String str = ( k < N ) ? s[k] : t[ k - N ] ; 
			
			int count = 0;
			for(int i = 0 ; i < N ; i ++){
				if(str.equals(s[i])){
					count ++;
				}
			}
			for(int j = 0 ; j < M ; j ++){
				if(str.equals(t[j])){
					count --;
				}
			}
			if(count > countMax){
				countMax = count;
			}
		}
		System.out.println(countMax);
	}
}
