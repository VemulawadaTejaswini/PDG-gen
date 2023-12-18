import java.util.*;

public class Main {
	int p, ace;
	char[] card;
	
	void add(char c){
		if(c=='A'){
			if(p+11<=21){
				ace++; 
				p+=11;
			}else{
				p++;
			}
		}else if(Character.isDigit(c)){
			p+=c-'0';
		}else{
			p+=10;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int t=0;t<n;t++){
			card = new char[10];
			for(int i=0;i<10;i++) card[i] = sc.next().charAt(0);
			p = 0;
			ace = 0;
			add(card[0]);
			add(card[1]);
			if(p==21){
				System.out.println("blackjack");
				continue;
			}
			
			for(int i=2;i<10;i++){
				if(p<17){
					add(card[i]);
				}else if(p==17 && ace>0){
					ace--;
					add(card[i]);
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