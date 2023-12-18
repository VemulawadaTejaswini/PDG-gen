import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int turn;
    	int Taro_Point = 0;
    	int Hanako_Point = 0;
    	int compare;
    	
    	turn = scan.nextInt();
    	String[] Taro_Card= new String[turn];
    	String[] Hanako_Card= new String[turn];
    	
    	for(int i = 0; i < turn; i++){
    		Taro_Card[i] = scan.next();
    		Hanako_Card[i] = scan.next();
    		
    		compare = Taro_Card[i].compareTo(Hanako_Card[i]);
    		
    		if(compare > 0){
    			Taro_Point += 3;
    		}else if(compare == 0){
    			Taro_Point++;
    			Hanako_Point++;
    		}else{
    			Hanako_Point += 3;
    		}
    		
    	}
    	
    	System.out.println(Taro_Point + " " + Hanako_Point);
     }
}