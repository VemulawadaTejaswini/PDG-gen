import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		while(!"0".equals(str)){
			int num = 0;
			String st[] = str.split("");
			for(int i = 0;i < st.length;i++){
				num += Integer.valueOf(st[i]).intValue();
			}
			System.out.println(num);
			str = s.next();
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}