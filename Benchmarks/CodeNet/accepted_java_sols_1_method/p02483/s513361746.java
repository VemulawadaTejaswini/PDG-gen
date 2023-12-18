import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> ar = new ArrayList<Integer>();
	ar.add(sc.nextInt());
	ar.add(sc.nextInt());
	ar.add(sc.nextInt());
     ar.sort(null);
     for(int i=0;i<2;i++){
    	 System.out.print(ar.get(i)+" ");
     }
     System.out.println(ar.get(2));
	
	}
}