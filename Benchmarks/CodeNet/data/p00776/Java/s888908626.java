import java.math.BigInteger;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int a,b,d;
		Scanner in = new Scanner(System.in);
		String string,string2;
		TreeSet<String> tree = new TreeSet<>(),tree2 = new TreeSet<>();
		char c;
		int i;
		while(true){
			string = in.nextLine();
			if(string.charAt(0) == '#') break;
			tree.add(string);
			for(c = 'z';c != 'a';c--){
				tree2 = (TreeSet<String>) tree.clone();
				tree.clear();
				while(!tree2.isEmpty()){
					string = tree2.pollFirst();
					a = string.indexOf(c);
					b = string.indexOf(c-1);
					if(b >= 0){
						for(i = b;i < string.length();i++){
							if(a != -1 && i >= a) break;
							if(string.charAt(i) == c-1){
								tree.add(string.substring(0, i) + String.valueOf(c) + string.substring(i+1,string.length()));
							}
						}
					}
					if(a == -1)
						tree.add(string);
				}
			}
			d = tree.size();
			System.out.println(d);
			for(i = 0;i < d;i++){
				if(i < 5 || d-i < 5){
					string = tree.pollFirst();
					System.out.println(string);
				}
			}
		}
	}
}