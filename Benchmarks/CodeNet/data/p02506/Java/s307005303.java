import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		new Main().find();
	}
	void find() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		try {
			String str;
			while(!(str=br.readLine()).equals("END_OF_TEXT")){
				String[] words = str.split(" ");	//すべての単語を個別にArrayListに追加
				for(String s : words){
					list.add(s);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//一応すべての単語を小文字にしておく
		for(int i=0; i<list.size(); i++){
			list.set(i, list.get(i).toLowerCase());
		}
		//一致するものをカウント
		int count = 0;
		String sampleWord = list.remove(0);
		for(String comp : list){
			if(sampleWord.equals(comp)){
				count++;
			}
		}
		System.out.println(count);
	}
}