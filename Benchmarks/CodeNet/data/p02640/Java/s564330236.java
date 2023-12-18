
import java.util.*;

class Main{
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt(),y=sc.nextInt();
		boolean ju=false;

		
		for(int i=0;i<x+1;i++){
			for(int j=0;j<x+1;j++){
				if(((i*2)+(j*4))==y){
					ju=true;
					break;
				}
			}
		}
		
		if(ju)System.out.println("Yes");
		else System.out.println("No");
	}
}