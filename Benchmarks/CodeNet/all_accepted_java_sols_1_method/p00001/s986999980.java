import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	 public static void main(String[] args)throws IOException{
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 for(int i = 0; i< 10; i++){
			 int w = sc.nextInt();
			 al.add(Integer.valueOf(w));
		 }
		 Collections.sort(al);
		 System.out.println(al.get(9));
		 System.out.println(al.get(8));
		 System.out.println(al.get(7));
    	
    }
}