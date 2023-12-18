//import java.lang.Math;
import java.util.*;
import java.util.Map.Entry;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;
 
public class Main{
	

	public static void main(String[] arg) {
               Scanner sc =new Scanner(System.in);
               TreeSet<Integer> ts= new TreeSet<Integer>();
               TreeSet<Integer> set1= new TreeSet<Integer>();
               int cnt=sc.nextInt();

               for(int i=0;i<cnt;i++){
            	  
                  set1.add(sc.nextInt());
                 }
               TreeSet<Integer> set2= new TreeSet<Integer>();
               int cnt2=sc.nextInt();

               for(int i=0;i<cnt2;i++){
                  set2.add(sc.nextInt());
                 }
                  
              ts.clear();
              ts.addAll(set1);
              ts.addAll(set2);
             
               for(Iterator<Integer> it=ts.iterator();it.hasNext();){
               int xx=it.next();
               System.out.println(xx);
               }
	}
	}
