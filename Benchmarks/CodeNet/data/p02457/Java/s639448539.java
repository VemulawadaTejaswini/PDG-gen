//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;
 
public class Main{
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] arg) {
 
        TreeSet<Integer> ht = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
 
        for (int i = 0; i < cnt; i++) {
 
            int cmt = sc.nextInt();
 
            switch (cmt) {
 
            case 0:
                int num = sc.nextInt();
                if(!ht.contains(num)) ht.add(num);
                 
                 
                System.out.println(ht.size());
                 
                break;
            case 1:
                int num2 = sc.nextInt();
                int cnt2 = 0;
                if(ht.contains(num2)) cnt2=1;
                 
                System.out.println(cnt2);
                    break;
            case 2:
                int num3=sc.nextInt();
                ht.remove(num3);
                break;
            case 3:
            	
                int l=sc.nextInt();
                int r=sc.nextInt();
                TreeSet<Integer> treesubset = new TreeSet<Integer>();
                treesubset=(TreeSet) ht.subSet(l, true, r, true);
               for(Iterator<Integer> it=treesubset.iterator();it.hasNext();){
            	   int ll=it.next();
                 System.out.println(ll);
                 }
               
               break;
                }
                }
             
        }
    }

