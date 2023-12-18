

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(
			new InputStreamReader(System.in));
		StringBuffer str =new StringBuffer();
		int i=1;
		while(true){
			int data = Integer.parseInt(br.readLine());
			if(data==0)
				break;
			str.append("Case").append(Integer.toString(i)).append(":").append(Integer.toString(data)).append("\n");
i++;
		}
		System.out.print(str);
	}
}