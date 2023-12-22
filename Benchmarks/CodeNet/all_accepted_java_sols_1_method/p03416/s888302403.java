import java.util.*;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		//5桁回文数→  1桁目=5桁目 かつ 2桁目=4桁目
		
		int count = 0 ;
		for(int i = A ; i <= B ;i ++){
			if( i/10000 == ( i % 10 ) && ( i /1000 ) % 10 == ( i /10 ) % 10 ){
				
				count ++;
			}
		}
		System.out.println(count);
	}
}
