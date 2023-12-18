
import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[5];
		int a=0;
		for(int i=0;i<5;i++){
			num[i]=sc.nextInt();
			if(num[i]==0)a=i;
		}
		System.out.println(a+1);
	
	}
}