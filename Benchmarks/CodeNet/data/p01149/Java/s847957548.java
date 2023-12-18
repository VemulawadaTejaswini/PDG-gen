import java.util.*;

public class Main {
	int p, ace;
	
	void check(char cc){
		if(cc=='A'){
			ace++;
			p+=11;
			if(p>21){
				ace--;
				p-=10;
			}
		}else if(Character.isDigit(cc)){
			p+=cc-48;
		}else{
			p+=10;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			char[] c = new char[10];
			for(int j=0;j<10;j++) c[j] = sc.next().charAt(0);
			ace = 0;
			p = 0;
			for(int j=0;j<2;j++) check(c[j]);
			if(p==21){
				System.out.println("blackjack");
				continue;
			}

			for(int j=2;j<10;j++){
				if(p==17 && ace>0){
					ace--;
					p-=10;
					check(c[j]);
				}else if(p<17){
					check(c[j]);
				}else{
					if(p>21) System.out.println("bust");
					else System.out.println(p);
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Main().run();
	}
}