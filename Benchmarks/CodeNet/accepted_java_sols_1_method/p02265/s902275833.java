import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int n=Integer.parseInt(in.readLine());
		Deque<String> list=new ArrayDeque<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++){
			String str[]=in.readLine().split(" ");
			if(str[0].equals("insert"))
				list.addFirst(str[1]);
			else if(str[0].equals("delete"))
				try{
					list.remove(str[1]);
				}catch(Exception e){
					continue;
				}
			else if(str[0].equals("deleteFirst"))
				list.removeFirst();
			else if(str[0].equals("deleteLast"))
				list.removeLast();
		}
		if(!list.isEmpty()){
			sb.append(list.getFirst());
			list.removeFirst();
		}
		while(!list.isEmpty()){
			sb.append(" ").append(list.getFirst());
			list.removeFirst();
		}
		out.println(sb.toString());

	}

}

