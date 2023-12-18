import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int m = sc.nextInt();
		while(m-->0){
			String t = sc.next();
			if(t.length()==1) pr.println(1);
			Set<String> train = new HashSet<String>();
			train.add(t);
			for(int k=0;k<t.length();k++){
				String d1 = t.substring(0, k);
				String d2 = t.substring(k, t.length());
				StringBuilder sb1 = new StringBuilder(d1);
				StringBuilder sb2 = new StringBuilder(d2);
				String rd1 = sb1.reverse().toString();
				String rd2 = sb2.reverse().toString();
				train.add(d2+d1);
				train.add(d1+rd2);
				train.add(rd2+d1);
				train.add(rd1+d2);
				train.add(d2+rd1);
				train.add(rd1+rd2);
				train.add(rd2+rd1);
			}
			pr.println(train.size());
		}
		pr.flush();
		sc.close();
	}
}