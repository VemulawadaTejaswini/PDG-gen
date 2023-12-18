import java.io.*;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		ArrayDeque<Integer> list=new ArrayDeque<Integer>();
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] stmp=br.readLine().split(" ");
			switch (stmp[0]){
			case "insert":
				list.push(Integer.parseInt(stmp[1]));
				break;
			case "delete":
				list.remove((Integer)Integer.parseInt(stmp[1]));
				break;
			case "deleteFirst":
				list.removeFirst();
				break;
			case "deleteLast":
				list.removeLast();
				break;
			default: break;
			}
		}
		if (!list.isEmpty()) pw.print(list.poll());
		for (;!list.isEmpty();){
			pw.print(" "+list.poll());
		}
		pw.println();
		pw.close();
	}
}