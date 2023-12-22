import java.util.Scanner;
//import java.lang.Math;
import java.util.ArrayList;

class Main{
	
	public static void main(String[] arg){
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> array= new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int nn=sc.nextInt();
		switch(nn){
				
		
		case 0:
			int trval=sc.nextInt();
			array.add(trval);
			break;
		case 2:
			array.remove(array.size()-1);
			break;
		
		case 1:
			trval=sc.nextInt();
				System.out.println(array.get(trval));
			break;
		}
		
		
		
		
		}
}}
