import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		ListOfTop3Hills();
	}
	
	
	public static void ListOfTop3Hills(){
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)list.add(scan.nextInt());
		Collections.sort(list);
		System.out.print(list.get(9)+"\n"+list.get(8)+"\n"+list.get(7));
	}
}