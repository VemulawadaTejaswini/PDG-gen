import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{

		Scanner scan = new Scanner(System.in);
		ArrayList<String> suite = new ArrayList<String>();
		ArrayList<String> hikaku = new ArrayList<String>();
		ArrayList<Integer> lb = new ArrayList<Integer>();
		ArrayList<Integer> lf = new ArrayList<Integer>();
		ArrayList<Integer> lr = new ArrayList<Integer>();
		ArrayList<Integer> lv = new ArrayList<Integer>();
		int n =scan.nextInt();
		for(int i=0;i<n;i++){
			int bb = scan.nextInt();
			int ff = scan.nextInt();
			int rr = scan.nextInt();
			int vv = scan.nextInt();
			lb.add(bb);
			lf.add(ff);
			lr.add(rr);
			lv.add(vv);
		}
		int heya = 0;
		int tou1 [] = new int [31];
		int tou2 [] = new int [31];
		int tou3 [] = new int [31];
		int tou4 [] = new int [31];
		for(int i =0;i<31;i++){
			tou1[i] = 0;
			tou2[i] = 0;
			tou3[i] = 0;
			tou4[i] = 0;
		}
		for(int i =0;i<lb.size();i++){
				heya = 0;
				heya += lr.get(i);
				heya += (lf.get(i) * 10 - 10);
//				System.out.println(heya);
				if(lb.get(i) == 1){
					tou1[heya] += lv.get(i);
				}
				if(lb.get(i) == 2){
					tou2[heya] += lv.get(i);
				}
				if(lb.get(i) == 3){
					tou3[heya] += lv.get(i);
				}
				if(lb.get(i) == 4){
					tou4[heya] += lv.get(i);
				}
		}
		for(int i = 1;i<31;i++){
			System.out.print(" "+tou1[i]);
			if(i == 10 || i == 20 || i == 30){
				System.out.println("");
			}
//			else{
//				System.out.print(" ");
//			}
		}
		System.out.println("####################");
		for(int i = 1;i<31;i++){
			System.out.print(" "+tou2[i]);
			if(i == 10 || i == 20 || i == 30){
				System.out.println("");
			}
//			else{
//				System.out.print(" ");
//			}
		}
		System.out.println("####################");
		for(int i = 1;i<31;i++){
			System.out.print(" "+tou3[i]);
			if(i == 10 || i == 20 || i == 30){
				System.out.println("");
			}
//			else{
//				System.out.print(" ");
//			}
		}
		System.out.println("####################");
		for(int i = 1;i<31;i++){
			System.out.print(" "+tou4[i]);
			if(i == 10 || i == 20 || i == 30){
				System.out.println("");
			}
//			else{
//				System.out.print(" ");
//			}
		}
	}
}