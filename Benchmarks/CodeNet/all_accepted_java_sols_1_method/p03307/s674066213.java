import java.util.*;

public class Main{
	public static void main(String args[]){
		int N,result;
		Scanner sc=new Scanner(System.in);
		N=Integer.parseInt(sc.next());
		result=N;
		if(N%2==1)result+=1;
		while(result%N!=0){
			result+=2;
		}
		System.out.println(result);
	}
}
		
