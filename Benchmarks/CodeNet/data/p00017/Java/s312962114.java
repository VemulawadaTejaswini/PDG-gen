import java.util.*;
class Main{
	public static void main(String[] a){
		Scanner in = new Scanner(System.in);
		List<Character> dict = new ArrayList<Character>();
		for(char c : "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray()) {
			dict.add(c);
		}
		while(in.hasNext()) {
			char[] line = in.nextLine().toCharArray();
			char[] tmp = new char[line.length];
			int l = dict.size();
			int x  = 0;
			while(l-->0) {
				for(int i = 0; i < line.length; i++) {
					if('.' == line[i] || ' ' == line[i]) {
						tmp[i] = line[i];
						continue;
					}
					int index = dict.indexOf(line[i]);
					index+=x;
					tmp[i] = dict.get(index);
				}
				String ans = new String(tmp);
				if(ans.contains("this")||ans.contains("that")||ans.contains("the")) {
					System.out.println(ans);
					break;
				}
				x++;
			}
		}
	}
}