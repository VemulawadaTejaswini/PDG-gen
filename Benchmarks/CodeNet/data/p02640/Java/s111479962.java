
import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt(),y=sc.nextInt();
		boolean ju=false;

		
		for(int i=0;i<x+1;i++){
			if((i*2)+((x-i)*4)==y){
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}