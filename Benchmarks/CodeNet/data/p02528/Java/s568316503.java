import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<Integer> numList = new ArrayList<Integer>();
	public void start(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] strs = list.get(1).split(" ");
		for(int i=0; i<strs.length; i++){
			numList.add(Integer.parseInt(strs[i]));
		}
		Collections.sort(numList);

		for(int i=0; i<numList.size()-1; i++){
			System.out.print(numList.get(i) + " ");
		}
		System.out.println(numList.get(numList.size()-1));
	}
	public static void main(String[] args){
		new Main().start();
	}
}