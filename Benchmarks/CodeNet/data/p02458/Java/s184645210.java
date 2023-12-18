
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		PrintWriter out=new PrintWriter(System.out);
        List<Integer> mset=new ArrayList<>();
        boolean ex[]=new boolean[1000000001];
        int q=Integer.parseInt(in.next());
        for(int i=0;i<q;i++) {
            int odr=Integer.parseInt(in.next());
            switch(odr) {
            case 0:
            	int x1=Integer.parseInt(in.next());
            	mset.add(x1);
                System.out.println(mset.size());
                break;
                 
            case 1:
            	int x2=Integer.parseInt(in.next());
            	Collections.sort(mset);
            	int k=mset.indexOf(x2),l=mset.lastIndexOf(x2);
                if(l>=0)System.out.println(l-k+1);
                else System.out.println(0);
                break;
                 
            case 2:
            	List<Integer> rm=new ArrayList<>();
            	rm.add(Integer.parseInt(in.next()));
                mset.removeAll(rm);
                break;
                 
            case 3:
            	int L=Integer.parseInt(in.next()),R=Integer.parseInt(in.next());
            	Collections.sort(mset);
            	for(int j=L;j<=R;j++) {
            		if(mset.contains(j)) {
            			int b=mset.indexOf(j),e=mset.lastIndexOf(j);
            			for(int v=b;v<=e;v++)out.println(j);
            		}
            	}
            	out.flush();
                //mset.dump(Integer.parseInt(in.next()),Integer.parseInt(in.next()));
                break;
            }
        }
	}

}

