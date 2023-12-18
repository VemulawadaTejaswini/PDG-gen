import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String n =scan.nextLine();
		int saizu =0;
		while(scan.hasNextInt()){
			int x = scan.nextInt();
			list.add(x);
		}
		for(int i=0;i<=list.size();i++){
			saizu = list.size();
			saizu -= 1;
			saizu -= i;
			System.out.print(list.get(saizu));
			if(saizu == 0){
				System.out.println("");
				break;
			}
			else{
				System.out.print(" ");
			}
		
		}
	}
}