import java.util.*;
 
 class Main{
 	  public static void main(String[] args) {
 	  	Scanner str = new Scanner(System.in);
 	  	ArrayList<Integer> n = new ArrayList<Integer>();
 	  	while(str.hasNextInt()){
 	  		int num = str.nextInt();
 	  		if(num != 0){
 	  			n.add(num);
 	  		}else{
 	  			break;
 	  		}
 	  	}
 	  	for(int i = 0; i < n.size(); i++){
 	  			System.out.println("Case" + (i+1) + ";" +  n.get(i));
 	  	}
 	  }
 }