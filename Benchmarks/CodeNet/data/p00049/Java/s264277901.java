import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int blood[] = new int [4];
		while(sc.hasNext()){
			String[] str = sc.next().split(",");
			switch (str[1]){
			case "A": blood[0]++; break;
			case "B": blood[1]++; break;
			case "AB": blood[2]++; break;
			case "O": blood[3]++; break;
			}
			
		}
		for (int ans : blood) {
			out.println(ans);
		}
		out.flush();
	}
}