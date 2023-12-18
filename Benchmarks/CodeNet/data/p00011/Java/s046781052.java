package p.saburou.aoj

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		initialization(num);
		setInputs(a, b);
		
		swap(num, a, b);
		
		for(int i = 0; i < num.size(); i++){
			System.out.println(num.get(i));
		}
	}
	
	private static void swap(ArrayList<Integer> num, ArrayList<Integer> a, ArrayList<Integer> b){
		if(a.size() == b.size()){
			for(int i = 0; i < a.size(); i++){
				int tmp = num.get(a.get(i) - 1);
				num.set(a.get(i) - 1, num.get(b.get(i) - 1));
				num.set(b.get(i) - 1, tmp);
			}
		}
	}
	
	private static void initialization(ArrayList<Integer> list){
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			list.add(i + 1);
		}
	}
	
	private static void setInputs(ArrayList<Integer> from, ArrayList<Integer> to){
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String tmp = sc.next();
			tmp = tmp.substring(0, tmp.length() - 1);
			from.add(Integer.parseInt(tmp));
			to.add(sc.nextInt());
		}
	}
}