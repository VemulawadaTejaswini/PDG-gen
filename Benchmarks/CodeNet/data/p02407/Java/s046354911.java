import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());
		//--- listにn個数字を入れる ---
		for(int i = 0; i < n; i++){
			list.add(Integer.parseInt(scan.next()));
		}//for
		//--- listの順番を逆にする
		Collections.reverse(list);
		//--- list内表示 ---
		for(int i = n-1; i >= 0; i--){
			System.out.print(list.get(i) + " ");
		}//for
                System.out.println();
	}
}