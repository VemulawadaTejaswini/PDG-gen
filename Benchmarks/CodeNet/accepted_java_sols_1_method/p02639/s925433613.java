import java.util.*;

public class Main{
//public class abc166_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] x =  new int[5];
		for(int i=0;i<5;i++){
			x[i] = scan.nextInt();
		}
		/*
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int x3 = scan.nextInt();
		int x4 = scan.nextInt();
		int x5 = scan.nextInt();

		if(s.equals("ABC")){
			System.out.println("ARC");
		}else{
			System.out.println("ABC");
		}
		*/
		for(int i=0; i<5; i++){
			if(x[i] == 0) System.out.println(i+1);
		}

	}

}