import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		new Main().find();
	}
	void find() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		ArrayList<String> list = new ArrayList<String>();
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		list.remove(0);
		Collections.sort(list);
		for(String s : list){
			System.out.println(s);
		}
	}
}