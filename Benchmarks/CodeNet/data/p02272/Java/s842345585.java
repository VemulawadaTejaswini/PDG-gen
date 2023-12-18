
import java.util.*;
import java.io.*;
public class Main {
	
	static int cc=0;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		//入力部
		int n=cin.nextInt();
		List<Integer> A=new ArrayList<>();
		for(int i=0;i<n;i++) {
			A.add(Integer.parseInt(cin.next()));
		}
		
		/*int m=cin.nextInt();
		List<Integer> B=new ArrayList<>();
		for(int i=0;i<m;i++)B.add(Integer.parseInt(cin.next()));*/
		
		//マージ
		List<Integer> C=mergeSort(A);
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<C.size()-1;i++) {
			out.print(C.get(i)+" ");
		}
		out.println(C.get(C.size()-1));
		out.println(cc);
		out.flush();
	}
	
	static List<Integer> merge(Queue<Integer> A, Queue<Integer> B) {
		
		List<Integer> C=new ArrayList<>();
		
		while(!A.isEmpty() && !B.isEmpty()) {
			cc++;
			int a=A.element(),b=B.element();
			
			if(a<b) {
				C.add(A.remove());
				//A.remove(0);
			}
			else if(a>b) {
				C.add(B.remove());
				//B.remove(0);
			}
			else {
				C.add(A.remove());C.add(B.remove());
				//A.remove(0);B.remove(0);
				cc++;
			}
		}
		
		if(A.isEmpty()) {
			while(!B.isEmpty()) {
				C.add(B.remove());
				//B.remove(0);
				cc++;
			}
		}
		else {
			while(!A.isEmpty()) {
				C.add(A.remove());
				//A.remove(0);
				cc++;
			}
		}
		
		return C;
	}

	static List<Integer> mergeSort(List<Integer> args) {
		int size=args.size();
		//System.out.println(list.size());
		//exit
		if(size==1)return args;
		
		//divide
		int mid=size/2;
		List<Integer> left=new ArrayList<>(args.subList(0, mid)),right=new ArrayList<>(args.subList(mid, size));
		//System.arraycopy(list, 0, left, 0, mid);
		//System.arraycopy(list, mid, right, 0, list.size()-mid);
		
		Queue<Integer>l=new ArrayDeque<>(mergeSort(left));
		Queue<Integer>r=new ArrayDeque<>(mergeSort(right));
		
		return merge(l,r);
	}

}


