import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{

        // 自分の得意な言語で
        // Let's チャレンジ！！
		int s = 0;
		int i = 0;
		String tN;
		ArrayList<String> array = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        	String line = br.readLine();
        	//文字列に先頭又は最後に空白文字がくっ付いている場合、それらを全て取り除きます。
        	line = line.trim();
        	//半角スペースを区切り文字として扱う
        	String[] readLineArray = line.split("[\\s+]");
        	//変数に配列を代入
        	int a = Integer.parseInt(readLineArray[0]);
        	int b = Integer.parseInt(readLineArray[1]);
        	if(a == 0 && b == 0){
        		break;
        	}else if(a > b){
        		s = a;
        		a = b;
        		b = s;

        	}
        	tN = (a+" "+b);
            array.add(tN);

        	i++;
        }
        int N = i;

        for(i = 0;i<N;i++){
        	System.out.println(array.get(i));
        }

    }
}