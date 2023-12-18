import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			String n = sc.nextLine();
			if(n.equals(".")) break;
			else calc(n);
		}
	}
	public void calc(String line){
		int ans = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < line.length(); i++){
			char c = line.charAt(i);
			if(c == '(') list.push(0);
			else if(c == '[') list.push(1);
			else if(c == ')'){
				if(list.size() == 0){
					ans = 1;
					break;
				}
				int t = list.pop();
				if(t != 0){
					ans = 1;
					break;
				}
			}
			else if(c == ']'){
				if(list.size() == 0){
					ans = 1;
					break;
				}
				int t = list.pop();
				if(t != 1){
					ans = 1;
					break;
				}
			}
		}
		if(ans == 1 || list.size() != 0){
			System.out.println("no");
		}
		else{
			System.out.println("yes");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}