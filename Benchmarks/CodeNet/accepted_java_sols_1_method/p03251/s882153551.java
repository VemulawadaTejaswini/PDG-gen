import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int yy = 0;
		int xx=0;
		int xe=0;
		int ye=0;
		
		while (scanner.hasNextLine()) {
			i++;
			String sc = scanner.nextLine();
			String[] list = sc.split(" ", 0);
			ArrayList<Integer> list2 = new ArrayList<Integer>();

			if(i==1){
				xe = Integer.parseInt(list[2]);
				ye = Integer.parseInt(list[3]);
			}

			if(i==2){
			for(int j=0; j<list.length; j++){
				list2.add(Integer.parseInt(list[j]));
			}
			list2.add(xe);
			Collections.sort(list2);
			Integer x = list2.get(list2.size()-1);
			xx = x.intValue();
			}

			if(i==3){
			list = sc.split(" ", 0);
			for(int j=0; j<list.length; j++){
				list2.add(Integer.parseInt(list[j]));
			}
			list2.add(ye);
			Collections.sort(list2);
			Integer y = list2.get(0);
			yy = y.intValue();
			}
		}
		if(xx >= yy){
			System.out.print("War");	
		}else{
		    System.out.print("No War");
		}
	}
}