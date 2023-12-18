import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Task> q = new ArrayDeque<Task>();
		ArrayDeque<Task> ans = new ArrayDeque<Task>();
		
		try {
			String[] param = in.readLine().split(" ");
			int lim = Integer.parseInt(param[0]);
			int time = Integer.parseInt(param[1]);
			
			for (int i = 0; i < lim; i++) {
				param = in.readLine().split(" ");
				
				Task t = new Task(Integer.parseInt(param[1]), param[0]);
				q.add(t);
			}

			int i = 0;
			
			while (q.isEmpty() == false) {
				Task tmp = q.remove();
				boolean flag = tmp.minusTime(time);
				
				if (flag == true) {
					ans.add(new Task(tmp.getTIme() + (i * time), tmp.getName()));
				} else {
					q.add(tmp);
				}
				
				i++;
			}
			
			while (ans.isEmpty() == false) {
				Task tmp = ans.remove();
				System.out.println(tmp.getName() + " " + tmp.getTIme());
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Task {
	private int time;
	private String name;
	
	public Task(int t, String n) {
		time = t;
		name = n;
	}
	
	public int getTIme() {
		return time;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean minusTime(int t) {
		time = time - t;
		if (time <= 0) return true;
		return false;
	}
}