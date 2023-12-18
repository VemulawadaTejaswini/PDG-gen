import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long x = in.nextLong();
			long y = in.nextLong();
			long mx=x,my=y;
			while(y!=0){
				x = x%y;
				long test=x;
				x = y;
				y = test;
			}
			System.out.println(x+" "+(mx/x*my));
		}
	}
}