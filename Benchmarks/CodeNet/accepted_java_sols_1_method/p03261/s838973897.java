import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			ArrayList<String> list = new ArrayList<String>();
			int N =Integer.parseInt(br.readLine());
			String pre = br.readLine();
			list.add(pre);
			for(int i=1;i<N;i++){
				String post = br.readLine();
				if(list.contains(post)){
					System.out.println("No");
					return;
				}
				if(pre.charAt(pre.length()-1) != post.charAt(0)){
					System.out.println("No");
                                        return;
				}
				list.add(post);
				pre = post;
			}
			System.out.println("Yes");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// NOP
			}
		}
	}

}
