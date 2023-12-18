import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
			int m = sc.nextInt();
			sc.nextLine();
			calc(m);
	}
	public void calc(int m){
		for(int i = 0; i < m; i++){
			String line = sc.nextLine();
			calc2(line);
		}
	}

	public void calc2(String line){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(line, 1);
		int ans = 1;
		for(int i = 1; i < line.length(); i++){
			String saki = line.substring(0,i);
			String ato = line.substring(i);
			String revSaki = reverse(saki);
			String revAto = reverse(ato);
			
			String s = saki + revAto;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
			s = revSaki + ato;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
			s = revSaki + revAto;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
			s = ato + saki;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
			s = revAto + saki;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
			s = ato + revSaki;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
			s = revAto + revSaki;
			if(!map.containsKey(s)){
				map.put(s, 1);
				ans++;
			}
		}
		System.out.println(ans);
	}
	public String reverse(String s){
		if(s.length() == 1) return s;
		else return reverse(s.substring(1)) + s.substring(0,1);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}