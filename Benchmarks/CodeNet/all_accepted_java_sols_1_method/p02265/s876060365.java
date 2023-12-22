import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int x=Integer.parseInt(br.readLine());
		ArrayDeque<Integer> list=new ArrayDeque<Integer>();
		for (int i = 0; i < x; i++) {
			String s=br.readLine();
			if(s.charAt(0)=='i'){
				list.addFirst(Integer.parseInt(s.substring(7)));
			}
			else if(s.charAt(6)==' '){
				list.remove(Integer.parseInt(s.substring(7)));
			}else if(s.charAt(6)=='F'){
				list.removeFirst();
			}else{
				list.removeLast();

			}
		}
		pw.print(list.poll());
		for (Integer integer : list) {
			pw.print(" "+integer);
		}
		pw.println();
		pw.close();
	}

}