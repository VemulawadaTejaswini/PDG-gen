import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String n =scan.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sss =1000000;
		int ddd =-1000000;
		long sum =0;
		long kazuA = 0;
		long kazuB = 0;
		while(scan.hasNextInt()){
			int x = scan.nextInt();
			list.add(x);
		}
		for(int i=0;i<list.size();i++){
			kazuA = list.get(i);
			if(kazuA < sss){
				sss = list.get(i);
			}
			if(kazuA > ddd){
				ddd = list.get(i);
			}
			sum+= list.get(i);
		} 
		System.out.println(sss+" "+ddd+" "+sum);
	}
}