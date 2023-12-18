import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		long p=1;
		
		for(int i=1;i<=N;i++){
			p=(int)(p*i%(Math.pow(10,9)+7));
			if(p==0){
				System.out.println(i);
				break;
			}
		}
	
		System.out.println(p);

	}

}
