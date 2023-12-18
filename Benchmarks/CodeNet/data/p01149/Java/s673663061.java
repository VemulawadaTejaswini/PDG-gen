import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			int score = 0;
			int a = 0;
			String s = sc.next();
			String t = sc.next();
			String strn = sc.nextLine();
			String[] str = (sc.nextLine()).split(" ");
			if(s.equals("A")&&(t.equals("T")||t.equals("J")||t.equals("Q")||t.equals("K"))){
				System.out.println("blackjack");
				continue;
			} else if(t.equals("A")&&(s.equals("T")||s.equals("J")||s.equals("Q")||s.equals("K"))){
				System.out.println("blackjack");
				continue;
			}
			
			if(s.equals("A")){
				score += 11;
				a++;
			} else if(s.equals("T")||s.equals("J")||s.equals("Q")||s.equals("K")){
				score += 10;
			} else {
				score += Integer.parseInt(s);
			}
			
			if(t.equals("A")){
				score += 11;
				a++;
			} else if(t.equals("T")||t.equals("J")||t.equals("Q")||t.equals("K")){
				score += 10;
			} else {
				score += Integer.parseInt(t);
			}
			if(score > 21){
				a--;
				score -= 10;
			}
			
			for(String st: str){
				if(st.equals("A")){
					score += 11;
					a++;
				} else if(st.equals("T")||st.equals("J")||st.equals("Q")||st.equals("K")){
					score += 10;
				} else if(st.equals("9")){
					score += 9;
				} else if(st.equals("8")){
					score += 8;
				} else if(st.equals("7")){
					score += 7;
				} else if(st.equals("6")){
					score += 6;
				} else if(st.equals("5")){
					score += 5;
				} else if(st.equals("4")){
					score += 4;
				} else if(st.equals("3")){
					score += 3;
				} else {
					score += 2;
				}
				
				while(score > 21 && a > 0){
					score -= 10;
					a--;
				}
				if(score > 21){
					System.out.println("bust");
					break;
				} else if(score > 17){
					System.out.println(Integer.toString(score));
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}