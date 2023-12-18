import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			if(N==0){
				break;
			}
			BigInteger[] a = new BigInteger[4001];
			for(int i = 0; i < a.length;i++){
				a[i]=new BigInteger("0");
			}
			long max=-1;
			TreeSet<Integer> t = new TreeSet<Integer>();
			int[] b = new int[4001];
			int count=0;
			for(int i = 0; i <N;i++){
				int sha = cin.nextInt();
				long tan = cin.nextInt();
				long suu = cin.nextInt();
				a[sha]=a[sha].add(new BigInteger(tan*suu +""));
				if(t.contains(sha)){
					
				}
				else{
					b[count++]=sha;
					t.add(sha);
				}
			}
			boolean f = false;
			for(int i = 0; i <count;i++){
				//System.out.println("   "+b[i]);
				if(a[b[i]].compareTo(new BigInteger("1000000"))>=0){
					System.out.println(b[i]);
					f=true;
				}
			}
			/*
			for(int i = 1;i<=4000;i++){
				if(a[i].compareTo(new BigInteger("1000000"))>=0){
					System.out.println(i);
					f=true;
				}
			}*/
			
			if(!f){
				System.out.println("NA");
			}
		}

	}

}