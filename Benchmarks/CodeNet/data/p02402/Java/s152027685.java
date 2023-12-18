import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sss =1000000;
		int ddd =-1000000;
		int sum =0;
		while(scan.hasNextLine()){
			int x = scan.nextInt();
			list.add(x);
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i) < sss){
				sss = list.get(i);
			}
			if(list.get(i) > ddd){
				ddd = list.get(i);
			}
			sum += list.get(i);
		}
		System.out.println(sss+" "+ddd+" "+sum);
	}
}