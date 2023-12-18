import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		ArrayList<String>	list;
		String[] str;
		BufferedReader br	=	new BufferedReader(new InputStreamReader(System.in));
		try {
			String s	=	br.readLine();
			list		=	new ArrayList<String>();
			str = s.split(" ");
			for(int i=0; i<str.length; i++){
				list.add(str[i]);
			}
			Collections.reverse(list);
			for(String a : list){
				System.out.print(a + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}