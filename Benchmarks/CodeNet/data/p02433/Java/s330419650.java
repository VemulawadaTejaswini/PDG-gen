//import java.lang.Math;
import java.util.*;
import java.util.List;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;


class Main{
	
	public static void main(String[] arg){
	
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		LinkedList<Integer> list= new LinkedList<Integer>();
		ListIterator<Integer> iterator =list.listIterator();
		
		for(int i=0;i<cnt;i++)
		{
		int sum=sc.nextInt();
			switch(sum){
			case 0:
				
				iterator.add(sc.nextInt());
				iterator.previous();
				break;
			case 1:
				int a=sc.nextInt();
				
				if(a>0){
					for(int j=0;j<a;j++){
						iterator.next();
						
						}
					}else {
					for(int j=0;j<-a;j++){
						iterator.previous();
						}
				}break;
			case 2:
				iterator.next();
				iterator.remove();
				break;
				
				}	
			
		}
			for(Integer x:list) System.out.println(x);
			
		
	}}
