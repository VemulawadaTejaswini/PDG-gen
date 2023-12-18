	import java.util.*;
	 
	class Main{
	  public static void main(String[] args){
	    
	 
	Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
        int[] X = new int[N];
        for (int j = 0; j < N ; j++){
  			X[j] = sc.nextInt();
        }
        String message = new String();
        for (int i = 0; i < N ; i++){
  			if (X[i]%2 == 0){
              if (X[i]%3 != 0 && X[i]%5 != 0){
                message = "DENIED";
                break;
              }
              else{ 
                message = "APPROVED";
  	          } 
            }
    		else{
              message = "APPROVED";
            }
            }
        System.out.println(message);
        }
	  }
	

