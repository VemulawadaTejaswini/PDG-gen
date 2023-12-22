import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args){
		Main.exec3();
	}
	
	static void exec1(){
		// http://abc064.contest.atcoder.jp/tasks/abc064_a
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			s = new String(in.readLine());
			s = s.replaceAll(" ", "");
			int i = Integer.parseInt(s);
			String opt;
			if(i%4 == 0) opt = "YES";
			else opt = "NO";
			System.out.println(opt);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	static void exec2(){
		// http://abc064.contest.atcoder.jp/tasks/abc064_b
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n_str, a_str;
		try {
			n_str = new String(in.readLine());
			a_str = new String(in.readLine());
			int n = Integer.parseInt(n_str);
			if(n<1 || n>100) throw new Exception();
			String[] a_str_arr = a_str.split(" ", 0);
			if(n != a_str_arr.length) throw new Exception();
			int max=0;
			int min=1000;
			for(int i=0; i<a_str_arr.length; i++){
				int a = Integer.parseInt(a_str_arr[i]);
				if(a<0 || a>1000) throw new Exception();
				if(max<a) max = a;
				if(min>a) min = a;
			}
			System.out.println(max-min);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	static void exec3(){
		// http://abc064.contest.atcoder.jp/tasks/abc064_c
		int[] color_rate = {400, 800, 1200, 1600, 2000, 2400, 2800, 3200, 4800};
		Boolean[] is_choosen_arr = new Boolean[8];
		Arrays.fill(is_choosen_arr, false);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n_str, a_str;
		try {
			n_str = new String(in.readLine());
			a_str = new String(in.readLine());
			int n = Integer.parseInt(n_str);
			if(n<1 || n>100) throw new Exception();
			String[] a_str_arr = a_str.split(" ", 0);
			if(n != a_str_arr.length) throw new Exception();
			
			int free_count = 0;
			for(int i=0; i<a_str_arr.length; i++){
				int a = Integer.parseInt(a_str_arr[i]);
				if(a<1 || a>4800) throw new Exception();
				for(int k=0; k<is_choosen_arr.length; k++){
					if(a < color_rate[k]){
						is_choosen_arr[k] = true;
						break;
					}
				}
				if(a >= color_rate[7]) free_count++;
			}
			int chosen_count = 0;
			for(int i=0; i<is_choosen_arr.length; i++){
				if(is_choosen_arr[i]) chosen_count++;
			}
			
			int min = chosen_count!=0 ? chosen_count: 1;
			int max = chosen_count+free_count;
			
			System.out.println(min + " " + max);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
