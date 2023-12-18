import java.util.Scanner;
import java.util.ArrayList;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<Integer>();
		while(scan.hasNext()){
			int t = scan.nextInt();
			if(t != 0){
				aList.add(t);
			}else{
				int size = aList.size();
				System.out.println(aList.get(size-1));
				aList.remove(size-1);
			}
		}
	}
}