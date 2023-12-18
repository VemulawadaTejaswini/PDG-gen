//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;


class Main{
	
	public static void main(String[] arg){
		
	

		int a=0,b=0;
		Scanner sc= new Scanner(System.in);
		List<Integer> list =new ArrayList<Integer>();
		int m=sc.nextInt();
		int[] str=new int[m];
		for(int i=0;i<m;i++){
			str[i]=sc.nextInt();
			list.add(new Integer(str[i]));
		}
		int n=sc.nextInt();
		for(int j=0;j<n;j++){
			int d=sc.nextInt();
			switch(d){
			case 0:
				a=sc.nextInt();
			    b=sc.nextInt();
			   
				List<Integer> l2=list.subList(a, b);
				int c=Collections.min(l2);
				System.out.println(c);
				break;
			case 1:
				
				a=sc.nextInt();
			    b=sc.nextInt();
					List<Integer> l3=list.subList(a, b);
				int q=Collections.max(l3);
				System.out.println(q);
				break;
			}
		}
	}}
