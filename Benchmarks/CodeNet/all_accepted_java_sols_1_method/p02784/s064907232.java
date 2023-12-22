import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int health = s.nextInt();
      	int numMoves = s.nextInt();
      	int sumMoves = 0;
      	for(int i=0;i<numMoves;i++){
        	sumMoves += s.nextInt();
        }
      	if(sumMoves>=health){
        	System.out.print("Yes");
        }
      	else{
        	System.out.print("No");
        }
    }
}