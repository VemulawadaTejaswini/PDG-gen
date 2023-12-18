//2017/4/7 ????????????

//API???????????????
import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice dice1 = new Dice();
    	int v = 0;
    	int up;
    	int front;
    	
    	for(int i = 0; i < 6; i++){
    		dice1.S[i] = scan.nextInt();
    	}
    	
    	int qustion = scan.nextInt();
    	
    	for(int j = 0; j < qustion; j++){
    		up = scan.nextInt();
    		front = scan.nextInt();
	    	
	    	switch(up){
	    			case 1:{
	    				if(front == 2)  v = 3;
	    				else if(front == 3) v = 5;
	    				else if(front == 4) v = 2;
	    				else if(front == 5) v = 4;
	    				break;
	    			}
	    			case 2:{
	    				if(front == 1)  v = 4;
	    				else if(front == 3) v = 1;
	    				else if(front == 4) v = 6;
	    				else if(front == 6) v = 3;
	    				break;
	    			}
	    			case 3:{
	    				if(front == 1)  v = 2;
	    				else if(front == 2) v = 6;
	    				else if(front == 5) v = 1;
	    				else if(front == 6) v = 5;
	    				break;
	    			}
	    			case 4:{
	    				if(front == 1)  v = 5;
	    				else if(front == 2) v = 1;
	    				else if(front == 5) v = 6;
	    				else if(front == 6) v = 2;
	    				break;
	    			}
	    			case 5:{
	    				if(front == 1)  v = 3;
	    				else if(front == 3) v = 6;
	    				else if(front == 4) v = 1;
	    				else if(front == 6) v = 4;
	    				break;
	    			}
	    			case 6:{
	    				if(front == 2)  v = 4;
	    				else if(front == 3) v = 2;
	    				else if(front == 4) v = 5;
	    				else if(front == 5) v = 3;
	    				break;
	    			}
	    	}
	    	System.out.println(dice1.S[v - 1]);
    	}
     }
}

class Dice{
	int[] S = new int[6];
}