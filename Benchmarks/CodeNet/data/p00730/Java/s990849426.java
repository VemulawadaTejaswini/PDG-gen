import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	static class Cake{
		int s, w, d;
		Cake(int tw, int td){
			w=tw;
			d=td;
			s=w*d;
		}
	}
	
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
        	while(sc.hasNext()) {
        		int n=sc.nextInt();
        		int w=sc.nextInt();
        		int d=sc.nextInt();
        		if(n+w+d==0) break;
        		
        		ArrayList<Cake> list=new ArrayList<Cake>();
        		Cake cake=new Cake(w, d);
        		
        		list.add(cake);
        		
        		for(int i=0; i<n; i++) {
        			int p=sc.nextInt();
        			int s=sc.nextInt();
        			Cake cut1, cut2;
        			
        			cake=list.remove(p-1);
        			int cutplace= s%(cake.w + cake.d);
        			
        			if(cutplace > cake.w) {
        				cut1 = new Cake(cake.w, cutplace-cake.w);
        				cut2 = new Cake(cake.w, cake.d - cut1.d);
        			}
        			else {
        				cut1 = new Cake(cutplace, cake.d);
        				cut2 = new Cake(cake.w - cutplace, cake.d);
        			}
        			if(cut1.s < cut2.s) {
        				list.add(cut1);
        				list.add(cut2);
        			}
        			else {
        				list.add(cut2);
        				list.add(cut1);
        			}
        		}
        		int size=list.size();
        		int[] s=new int[size];
        		
        		for(int i=0; i<size; i++) {
        			s[i]=list.get(i).s;
        		}
        		Arrays.sort(s);
        		
        		for(int i=0; i<size; i++) {
        			if(i!=0) System.out.print(" ");
        			System.out.print(s[i]);
        		}
        		System.out.println();
        		
        	}
        	
        	
        	
        }
    }
}

