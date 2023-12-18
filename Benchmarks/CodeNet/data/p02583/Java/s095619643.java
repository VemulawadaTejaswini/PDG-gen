import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			int number=sc.nextInt();
			set.add(number);
		}
	
		List<Integer> list=new ArrayList<Integer>();
		for(int value:set) {
			list.add(value);
		}
		
		int nn=list.size();
		int count=0;
		
		for(int i=0;i<nn-2;i++) {
			int a=list.get(i);
			for(int k=i+1;k<nn-1;k++) {
				int b=list.get(k);
				for(int l=k+1;l<nn;l++) {
					int c=list.get(l);
					
					if(a!=b && b!=c && c!=a && a+b>=c && b+c>=a && c+a>=b) {
						count++;			
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}

		System.out.println(count);
	}

}
