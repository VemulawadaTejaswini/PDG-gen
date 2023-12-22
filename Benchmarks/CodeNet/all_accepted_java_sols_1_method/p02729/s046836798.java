import java.util.*;
import java.lang.Math;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int countn = 0;
		int countm =0;
		for(int i =2;i<=n*2;i=i+2){
			countn= countn+(n-(i/2));
		}
		for(int i=2;i<=m*2;i=i+2){
			countm=countm+(m-(i/2));
		}
		System.out.print(countn+countm);
		
	}
}