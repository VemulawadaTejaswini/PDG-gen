import java.util.*;

public class Main{
  
  public static void main (String[] args){
  
  	Scanner scanner = new Scanner(System.in);
    
  	int blueCards = scanner.nextInt();
    String[] blueList = new String[blueCards];
  
    scanner.nextLine();
    
  	for(int index=0; index<blueCards; index++){
  		String temp = scanner.nextLine();
      	blueList[index]=temp;
  	}
    
    int redCards = scanner.nextInt();
    String[] redList = new String[redCards];
    
    scanner.nextLine();
    
    for(int index=0; index<redCards; index++){
      String temp = scanner.next();
      redList[index] = temp;
    }
    
    HashMap <String,Integer> cardMap = new HashMap <String,Integer>();
    
    for (int index=0; index<blueCards; index++) {
    	if (cardMap.containsKey(blueList[index])) {
    	} else {
    		cardMap.put(blueList[index], index);
    	}
    }
    
    for (int index=0; index<redCards; index++) {
    	if (cardMap.containsKey(redList[index])){
    	} else {
    		cardMap.put(redList[index], index+blueCards);
    	}
    }
    
    int[] scoreList = new int[blueCards+redCards];
    for (int index=0; index<scoreList.length; index++) {
    	int defaultValue = 0;
    	defaultValue = scoreList[index];
    }
    
    for (int index=0; index<blueCards; index++) {
    	String temp = blueList[index];
    	int indexNum = cardMap.get(temp);
    	int score =scoreList[indexNum];
    	score++;
    	scoreList[indexNum]=score;
    }
    
    for (int index=0; index<redCards; index++) {
    	String temp = redList[index];
    	int indexNum = cardMap.get(temp);
    	int score = scoreList[indexNum];
    	score--;
    	scoreList[indexNum]=score;
    }
    
    int maximunScore =0;
    
    for (int index=0; index<blueCards+redCards; index++) {
    	int temp=scoreList[index];
    	if (temp>maximunScore) {
    		maximunScore=temp;
    	}
    }
    
    System.out.println(maximunScore);
    
  }
}