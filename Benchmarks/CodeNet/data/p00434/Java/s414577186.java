import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		BitSet b = new BitSet(31);
		b.set(1, 31);
		for(int i=0;i<28;i++)
			b.clear(s.nextInt());
		System.out.println(b.toString().replaceAll("[^0-9,]", "").replace(',', '\n'));
	}
}