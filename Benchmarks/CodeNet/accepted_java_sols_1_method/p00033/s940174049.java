import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Stack<Integer> A=new Stack<>(),B=new Stack<>();
		
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			A.clear(); B.clear();
			int C[]=new int[10];
			for(int j=0;j<10;j++)C[j]=Integer.parseInt(in.next());
			A.push(C[0]);
			
			int j=1;
			for(;j<10;j++) {
				if(C[j]<A.peek()) {
					if(B.isEmpty() || C[j]>B.peek())B.push(C[j]);
					else{
						System.out.println("NO");
						break;
					}
				}
				else {
					if(B.isEmpty() || C[j]-A.peek()<=C[j]-B.peek() || C[j]<B.peek())A.push(C[j]);
					else B.push(C[j]);
				}
			}
			
			if(j==10)System.out.println("YES");
			
//			System.out.println(A);
//			System.out.println(B);
		}
	}

}

