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
	
	static List<Integer> merge(List<Integer> A, List<Integer> B) {
		
		List<Integer> C=new ArrayList<>();
		
		while(!A.isEmpty() && !B.isEmpty()) {
			cc++;
			int a=A.get(0),b=B.get(0);
			
			if(a<b) {
				C.add(a);
				A.remove(0);
			}
			else if(a>b) {
				C.add(b);
				B.remove(0);
			}
			else {
				C.add(a);C.add(b);
				A.remove(0);B.remove(0);
				cc++;
			}
		}
		
		if(A.isEmpty()) {
			while(!B.isEmpty()) {
				C.add(B.get(0));
				B.remove(0);
				cc++;
			}
		}
		else {
			while(!A.isEmpty()) {
				C.add(A.get(0));
				A.remove(0);
				cc++;
			}
		}
		
		return C;
	}

	static List<Integer> mergeSort(List<Integer> args) {
		List<Integer> list=new ArrayList<>(args);
		//System.out.println(list.size());
		//exit
		if(list.size()==1)return list;
		
		//divide
		int mid=list.size()/2;
		List<Integer> left=new ArrayList<>(list.subList(0, mid)),right=new ArrayList<>(list.subList(mid, list.size()));
		//System.arraycopy(list, 0, left, 0, mid);
		//System.arraycopy(list, mid, right, 0, list.size()-mid);
		
		left=mergeSort(left);
		right=mergeSort(right);
		
		return merge(left,right);
	}

}


