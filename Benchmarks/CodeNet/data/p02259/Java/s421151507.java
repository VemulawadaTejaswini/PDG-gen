import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 List<Integer> A=new ArrayList<>();
		 
		 for(int i=0;i<n;i++)A.add(Integer.parseInt(in.next()));
		 in.close();
		 
		 int swap=bubble(A);
		 for(int i=0;i<n-1;i++)System.out.print(A.get(i)+" ");
		 System.out.println(A.get(n-1));
		 System.out.println(swap);
	}
	
	static int bubble(List<Integer> A) {
		boolean f=true;
		int sw=0;
		
		while(f) {
			f=false;
			for(int i=A.size()-1;i>0;i--) {
				if(A.get(i)<A.get(i-1)) {
					Collections.swap(A, i, i-1);
					sw++;
					f=true;
				}
			}
		}
		
		return sw;
	}

}

