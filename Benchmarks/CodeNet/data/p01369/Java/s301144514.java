import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			String n = sc.nextLine();
			if(n.equals("#")) break;
			else calc(n);
		}
	}
	public void calc(String line){
		//char[] right = {'h','i','j','k','l','m','n','o','p','u','y'};
		String right = "hijklmnopuy";
		int now = -1;
		int count = 0;
		
		String first = String.valueOf(line.charAt(0));
		if(right.indexOf(first) != -1){
			now = 1;
		}
		else now = 0;
		
		for(int i = 1; i < line.length(); i++){
			String c = String.valueOf(line.charAt(i));
			int rightDayo = right.indexOf(c);
			if(rightDayo != -1 && now == 0){
				count++;
				now = 1;
			}
			else if(rightDayo == -1 && now == 1){
				count++;
				now = 0;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}