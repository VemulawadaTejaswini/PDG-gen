import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        PrintWriter out=new PrintWriter(System.out);
        TreeMap<Integer,Integer> mset=new TreeMap<>();
        int q=Integer.parseInt(in.next()),size=0;
        for(int i=0;i<q;i++) {
            int odr=Integer.parseInt(in.next());

            switch(odr) {
            case 0:
            	int x0=Integer.parseInt(in.next());
            	Integer num0=mset.get(x0);
            	if(num0!=null)mset.put(x0, num0+1);
            	else mset.put(x0, 1);
            	size++;
            	out.println(size);
            	break;

            case 1:
            	int x1=Integer.parseInt(in.next());
            	Integer num1=mset.get(x1);
            	out.println((num1!=null)? num1:0);
            	break;

            case 2:
            	int x2=Integer.parseInt(in.next());
            	Integer num2=mset.get(x2);
            	if(num2!=null)size-=num2;
            	mset.remove(x2);
            	break;

            case 3:
            	int L=Integer.parseInt(in.next()),R=Integer.parseInt(in.next());
            	NavigableMap<Integer,Integer> sub=mset.subMap(L, true, R, true);
            	Iterator<NavigableMap.Entry<Integer,Integer>> itr=sub.entrySet().iterator();
            	
            	while(itr.hasNext()) {
            		NavigableMap.Entry<Integer,Integer> get=itr.next();
            		int k=get.getKey(),num=get.getValue();
            		for(int j=0;j<num;j++)out.println(k);
            	}
            	break;
            }
        }
        out.flush();
    }

}
