//Volume5-0588
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc  = new Scanner(System.in);
		int     sum = Integer.parseInt(sc.next()),
			    d;
		char    c;

		while(true){
			c = sc.next().toCharArray()[0];
			if(c=='='){break;}
			d = Integer.parseInt(sc.next());
			switch(c){
				case '+': {sum += d; break;}
				case '-': {sum -= d; break;}
				case '*': {sum *= d; break;}
				case '/': {sum /= d;       }
			}
		}
		System.out.println(sum);
	}
}