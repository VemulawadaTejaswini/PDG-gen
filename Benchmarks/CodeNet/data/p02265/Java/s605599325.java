

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=new String[2];
		Deque<String> list=new ArrayDeque<>();
		StringBuffer ans =new StringBuffer();
		
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			
			for(int i=0;i<n;i++){
				str=br.readLine().split("\\s+");
				if(str[0].equals("insert"))
					list.addFirst(str[1]);
				else if(str[0].equals("delete"))
					list.remove(str[1]);
				else if(str[0].equals("deleteFirst"))
					list.removeFirst();
				else if(str[0].equals("deleteLast"))
					list.removeLast();
			
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!list.isEmpty()){
			ans.append(list.getFirst());
			list.removeFirst();
		}
		while(!list.isEmpty()){
			ans.append(" ").append(list.getFirst());
			list.removeFirst();
		}
		System.out.println(ans.toString());
		
	}

}

