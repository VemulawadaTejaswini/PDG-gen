import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> gyaku = new ArrayList<Integer>();
		String n =scan.nextLine();
		while(scan.hasNextInt()){
			int x = scan.nextInt();
			list.add(x);
		}
		//for(int i=0;i<list.size();i++){
		//	int size = list.size();
		//	int y = list.get(size - i);
		//	gyaku.add(y);
		//}
		for(int i=0;i<list.size();i++){
			int saizu = list.size();
			System.out.print(list.get(saizu - i));
			if((saizu-i) == 0){
				System.out.println("");
			}
			else{
				System.out.print(" ");
			}
		
		}
	}
}