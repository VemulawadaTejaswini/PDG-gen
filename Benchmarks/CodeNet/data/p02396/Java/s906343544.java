import java.util.*;
 
 class Main{
 	  public static void main(String[] args) {
 	  	Scanner str = new Scanner(System.in);
 	  	ArrayList<Integer> x = new ArrayList<Integer>();
 	  	while(str.hasNextInt()){
 	  		int num = str.nextInt();
 	  		if(num != 0){
 	  			x.add(num);
 	  		}else{
 	  			break;
 	  		}
 	  	}
 	  	for(int i = 0; i < x.size(); i++){
 	  			System.out.println("Case " + (i+1) + "; " +  x.get(i));
 	  	}
 	  }
 }
 