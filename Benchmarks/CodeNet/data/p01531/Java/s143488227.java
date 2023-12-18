import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// #か行：'k'
		// #さ行：'s'
		// #た行：'t'
		// #な行：'n'
		// #は行：'h'
		// #ま行：'m'
		// #や行：'y'
		// #ら行：'r'
		// #わ行：'w'
		//
		// #'T'：タッチするだけ
		// #'L'：左にフリックする
		// #'U'：上にフリックする
		// #'R'：右にフリックする
		// #'D'：下にフリックする
		//
		// c =
		// {"1"=>"","2"=>"k","3"=>"s","4"=>"t","5"=>"n","6"=>"h","7"=>"m","8"=>"y","9"=>"r","0"=>"w"}
		// m = {"T"=>"a","L"=>"i","U"=>"u","R"=>"e","D"=>"o"}
		// line = gets.chomp.split("")
		// line.each_index do |i|
		// if i.even?
		// if line[i]=="0"&&line[i+1]=="U"
		// print ""
		// else
		// print c[line[i]]
		// end
		// else
		// if line[i-1]=="0" && line[i] == "U"
		// print "nn"
		// else
		// print m[line[i]]
		// end
		// end
		// end
		// print "\n"
		Map<String, String> hash = new HashMap<String, String>();
		hash.put("1", "");
		hash.put("2", "k");
		hash.put("3", "s");
		hash.put("4", "t");
		hash.put("5", "n");
		hash.put("6", "h");
		hash.put("7", "m");
		hash.put("8", "y");
		hash.put("9", "r");
		hash.put("0", "w");
		hash.put("T", "a");
		hash.put("U", "u");
		hash.put("D", "o");
		hash.put("R", "e");
		hash.put("L", "i");
		char[] cs = sc.next().toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (i % 2 == 0) {
				if (cs[i] == '0' && cs[i + 1] == 'U') {
					System.out.print("");
				} else
					System.out.print(hash.get(cs[i]));
			} else {
				if (cs[i - 1] == '0' && cs[i] == 'U') {
					System.out.print("nn");
				} else
					System.out.print(hash.get(cs[i]));
			}
		}
		System.out.print("\n");
	}
}