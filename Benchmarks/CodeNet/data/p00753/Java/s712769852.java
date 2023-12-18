import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BitSet p = prime(300000);
		while(true){
			int n = in.nextInt();
			System.out.println(p.get(n+1, 2*n+1).cardinality());
		}
	}
	
	public static BitSet prime(int max){
		BitSet p = new BitSet(max);
		p.set(2, max);
		for(int i=p.nextSetBit(0); i!=-1; i=p.nextSetBit(i+1)){
			for(int j=2; j*i<=max; j++){
				p.clear(j*i);
			}
		}
		return p;
	}
}