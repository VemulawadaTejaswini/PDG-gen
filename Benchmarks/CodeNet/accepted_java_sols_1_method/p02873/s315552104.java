import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int n = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");
		boolean check =false;//false> true<
		ArrayList<Integer> zeroList = new ArrayList<>();
		
		for(int i=0;i<ss.length;i++) {
			if(!check) {
				if(ss[i].equals("<")){
					zeroList.add(i);
					check=true;
				}
			}else {
				if(ss[i].equals(">"))check=false;
			}
		}
		
		if(ss[ss.length-1].equals(">"))zeroList.add(ss.length);
		
		int[] a = new int[ss.length+1];
		for(int i =0;i<a.length;i++) {
			a[i]=-1;
		}
		for(int i =0;i<zeroList.size();i++) {
			a[zeroList.get(i)] =0;
			int index = zeroList.get(i)-1;
			while(index>-1&&ss[index].equals(">")) {
				if(a[index]<a[index+1]+1) {
					a[index]=a[index+1]+1;
				}
				index--;
			}
			index = zeroList.get(i);
			while(index<ss.length&&ss[index].equals("<")) {
				a[index+1]=a[index]+1;
				index++;
			}
		}
		
		long  sum = 0;
		for(int i =0;i<a.length;i++) {
			sum +=a[i];
		}
		System.out.println(sum);
		
		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
		treeMap.put(b[n], n);
		*/

	}

	

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
