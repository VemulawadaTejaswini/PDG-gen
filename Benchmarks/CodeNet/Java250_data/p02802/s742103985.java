import java.util.*;
public class Main{
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Answer> map = new HashMap<>();
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			String ans = sc.next();
			if (map.containsKey(p)) {
				Answer nowAns = map.get(p);
				if (ans.equals("AC")) {
					nowAns.setAc(true);
				} else if (!nowAns.getAc()) {
					nowAns.Add();
				}
			} else {
				Answer answer = main.new Answer(ans);
				map.put(p, answer);
			}
		}
		int acCount = 0;
		int waCount = 0;
		for (Integer key : map.keySet()) {
			Answer nowAns = map.get(key);
			if (nowAns.getAc()) {
				acCount++;
				waCount += nowAns.getWa();
			}
		}
		System.out.println(acCount + " " + waCount);
	}
	
	public class Answer {
		
		public Answer(String key) {
			if (key.equals("AC")) {
				this.ac =true;
			} else {
				this.wa++;
			}
		}
		
		public boolean ac = false;
		public int wa = 0;
		
		public boolean getAc() {
			return this.ac;
		}
		
		public void setAc(boolean b) {
			this.ac = true;
		}
		
		public void Add() {
			this.wa++;
		}
		
		public int getWa() {
			return this.wa;
		}
	}
}