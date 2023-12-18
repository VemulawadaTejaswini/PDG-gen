import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		int size = 0;

		for(int i=0;sc.hasNext();i++){
			String[] s = sc.next().split(",");
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for(int j=0;j<s.length;j++){
				tmp.add(Integer.parseInt(s[j]));
			}
			size = Math.max(size,s.length);
			al.add(tmp);
		}

		int[] sum = new int[size];
		sum[0] = al.get(0).get(0);
		for(int i=0;i<size-1;i++){
			int[] next = new int[size];
			for(int j=0;j<al.get(i).size();j++){
				next[j] = Math.max(sum[j]+al.get(i+1).get(j), next[j]);
				next[j+1] = Math.max(sum[j]+al.get(i+1).get(j+1), next[j+1]);
			}
			for(int j=0;j<size;j++) sum[j] = next[j];
		}

		for(int i=size;i<size*2-1;i++){
			int[] next = new int[size];
			for(int j=0;j<al.get(i).size();j++){
				next[j] = al.get(i).get(j) + Math.max(sum[j],sum[j+1]);
			}
			for(int j=0;j<size;j++) sum[j] = next[j];
		}

		System.out.println(sum[0]);
	}
}