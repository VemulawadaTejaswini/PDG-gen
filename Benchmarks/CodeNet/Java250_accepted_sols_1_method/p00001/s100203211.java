import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []x=new int [10];
		for(int i=0;i<x.length;i++){
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println(x[9]);
		System.out.println(x[8]);
		System.out.println(x[7]);
	}
}