import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a1 = n%100;
		int a2 = n/100;
		if((a1>12 || a1==0) && (a2>12 || a2==0)){
			System.out.println("NA");
		}else if(a1>0 && a1<13 && a2>0 && a2<13){
			System.out.println("AMBIGUOUS");
		}else if((a1>12 || a1==0) && (a2>0 && a2<13)){
			System.out.println("MMYY");
		}else{
			System.out.println("YYMM");
		}
	}
}