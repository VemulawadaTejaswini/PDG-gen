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
			if(up == dice1.S[0]){
				if(front == dice1.S[1])  v = dice1.S[2];
				else if(front == dice1.S[2]) v = dice1.S[4];
				else if(front == dice1.S[3]) v = dice1.S[1];
				else if(front == dice1.S[4]) v = dice1.S[3];
			}else if(up == dice1.S[1]){
				if(front == dice1.S[0])  v = dice1.S[3];
				else if(front == dice1.S[2]) v = dice1.S[0];
				else if(front == dice1.S[3]) v = dice1.S[5];
				else if(front == dice1.S[5]) v = dice1.S[2];
			}else if(up == dice1.S[2]){
				if(front == dice1.S[0])  v = dice1.S[1];
				else if(front == dice1.S[1]) v = dice1.S[5];
				else if(front == dice1.S[4]) v = dice1.S[0];
				else if(front == dice1.S[5]) v = dice1.S[4];
			}else if(up == dice1.S[3]){
				if(front == dice1.S[0])  v = dice1.S[4];
				else if(front == dice1.S[1]) v = dice1.S[0];
				else if(front == dice1.S[4]) v = dice1.S[5];
				else if(front == dice1.S[5]) v = dice1.S[1];
			}else if(up == dice1.S[4]){
				if(front == dice1.S[0])  v = dice1.S[2];
				else if(front == dice1.S[2]) v = dice1.S[5];
				else if(front == dice1.S[3]) v = dice1.S[0];
				else if(front == dice1.S[4]) v = dice1.S[3];
			}else{
				if(front == dice1.S[1])  v = dice1.S[3];
				else if(front == dice1.S[2]) v = dice1.S[1];
				else if(front == dice1.S[3]) v = dice1.S[4];
				else if(front == dice1.S[4]) v = dice1.S[2];
			}
			System.out.println(v);
    	}	    	
     }
}

class Dice{
	int[] S = new int[6];
}