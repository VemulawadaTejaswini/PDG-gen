import java.util.Scanner;
 
class Main{
    	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
        	String card1,card2;
        	int cnt1 = 0,cnt2 = 0, x;
        	int y = sc.nextInt();
        	for(int i = 0; i < y; i++){
            		card1 = sc.next();
            		card2 = sc.next();
            		x = card1.compareTo(card2);
            		if(x == 0){
				cnt1++;
				cnt2++;
			}else if(x > 0){
				cnt1 += 3;
            		}else{
				cnt2 += 3;
        		}
		}
        	System.out.println(cnt1 + " " + cnt2);
    	}
}