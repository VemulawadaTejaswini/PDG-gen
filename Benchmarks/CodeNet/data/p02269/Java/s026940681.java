
import java.util.BitSet;
import java.util.Scanner;

//implement a simple dictionary for [A,C,G,T] 1 ... 12
public class Main {
	public static final int max_size = 1 << 26;
	
	public static BitSet dict = new BitSet(max_size);
	public static int translate(char c) {
		switch(c) {
		case 'A': return 0;
		case 'C': return 1;
		case 'G': return 2;
		case 'T':return 3;
		}
		
		return -1;
	}
	
	public static int translate(String c) {
		int code = 0;
		int base = 1;
		for(int i = 0; i < c.length(); i++) {
			code += translate(c.charAt(i))*base;
			base *= 4;
		}
		return code;
	}
	
	public static void insert(String gene) {
		dict.set(translate(gene));
	}
	
	public static boolean find(String gene) {
		return dict.get(translate(gene));
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		String cmd, key;
		
		
		while(len > 0) {
			cmd = cin.next();
			key = cin.next();
			if(cmd.equals("insert")) {
				insert(key);
			}else {
				if(find(key)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
			
			len--;
		}
		
		
		cin.close();
	}

}