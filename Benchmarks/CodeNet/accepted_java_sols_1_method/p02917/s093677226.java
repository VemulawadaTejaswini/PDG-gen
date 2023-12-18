
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		TreeMap<Integer,ArrayList<Integer>> tmap=new TreeMap<>();
		for(int i=0;i<n-1;i++) {
			int x=scn.nextInt();
			if(tmap.containsKey(x)) {
				ArrayList<Integer> a=tmap.get(x);
				a.add(i);
				tmap.put(x, a);
			}else{
				ArrayList<Integer> a=new ArrayList<>();
				a.add(i);
				tmap.put(x, a);
			}
		}
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=-1;
		}
		Set<Integer> set=tmap.keySet();
		for(int x:set) {
			ArrayList<Integer> al=tmap.get(x);
			for(int i=0;i<al.size();i++) {
				if(arr[al.get(i)]==-1)
				arr[al.get(i)]=x;
				if(arr[al.get(i)+1]==-1)
				arr[al.get(i)+1]=x;
			}
		}
		int sum=0;
		//System.out.println(tmap);
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
