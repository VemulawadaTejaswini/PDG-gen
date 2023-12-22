import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> w = new ArrayList<Integer>();
		List<Integer> h = new ArrayList<Integer>();


		 for(int i=0;;i++){
			 h.add(i, scan.nextInt());
			 w.add(i, scan.nextInt());
			 if(w.get(i)==0 && h.get(i)==0) break;
		 }

		 for(int i=0;;i++){
			if(w.get(i)==0 && h.get(i)==0) break;
			printFlame(w.get(i),h.get(i));
		 }
	}

	static void printFlame(int w,int h){
		for(int i=0 ;i< h;i++){
			if(i%2==0){
				for(int j=0 ; j < w;j++){
					if(j%2==0) System.out.print("#");
					if(j%2!=0) System.out.print(".");
				}
			}else{
				for(int j=0 ; j < w;j++){
					if(j%2==0) System.out.print(".");
					if(j%2!=0) System.out.print("#");
				}
		}
			System.out.println();
		}
		
		System.out.println();

	}

}