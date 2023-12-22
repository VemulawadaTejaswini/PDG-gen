import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		 ArrayList<ArrayList<Integer>> al= new ArrayList<>();
		 for(int i=0;i<n;i++){
			 ArrayList<Integer>al1 = new ArrayList<>();
			 al.add(al1);
		 }
		int m =scn.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		while(m-->0){
			int a=scn.nextInt();
			int b =scn.nextInt();
			a--;
			b--;
			ArrayList<Integer> al1 =al.get(a);
			al1.add(b);
			ArrayList<Integer> al2 = al.get(b);
			al2.add(a);
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			ArrayList<Integer> al1 = al.get(i);
			boolean f =true;
			for(int val : al1){
				if(arr[i]<=arr[val]){
					f=false;
					break;
				}
			}
			if(f){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}