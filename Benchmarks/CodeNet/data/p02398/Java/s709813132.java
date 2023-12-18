import java.util.Scanner;
public class Main {
	void howmany(){
		int a,b,c,cnt;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		cnt = 0;
		for(int i = a ; i <= b ; i++){
			if((c%i)==0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static void main(String args[]){
		Main m = new Main();
		m.howmany();
	}
}