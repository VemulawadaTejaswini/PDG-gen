import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int n=Integer.parseInt(in.readLine());
		StringBuilder sb=new StringBuilder();
		HashSet<String> set=new HashSet<>();
		ArrayList<String> res=new ArrayList<>();
		for(int i=0;i<n;i++){
			String str[]=in.readLine().split(" ");
			if(str[0].equals("insert"))
				set.add(str[1]);
			else{
				if(set.contains(str[1]))
					res.add("yes");
				else
					res.add("no");
			}

		}
		for(int i=0;i<res.size();i++){
			if(i==n-1)
				out.print(res.get(i));
			else
				out.printf(res.get(i)+"\n");
		}
	}

}

