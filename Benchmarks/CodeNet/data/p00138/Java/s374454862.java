import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		player player1[] = new player[7];
		player player2[] = new player[7];
		player player3[] = new player[7];
        for(int i=0; i<7; i++)player1[i] = new player(sc.nextInt() , sc.nextDouble());
        for(int i=0; i<7; i++)player1[i] = new player(sc.nextInt() , sc.nextDouble());
        for(int i=0; i<7; i++)player1[i] = new player(sc.nextInt() , sc.nextDouble());
        
        Arrays.sort(player1);
        System.out.println(player1[0] + "\n" + player1[1]);
        player1[0].record = 100;
        player1[1].record = 100;
         
        Arrays.sort(player2);
        System.out.println(player1[8] + "\n" + player1[9]);
        player2[0].record = 100;
        player2[1].record = 100;
         
        Arrays.sort(player3);
        System.out.println(player1[16] + "\n" + player1[17]);
        player3[0].record = 100;
        player3[1].record = 100;
         
        Arrays.sort(player1);
        System.out.println(player1[0] + "\n" + player1[1]);
 
    }
}
	class player implements Comparable<player>{
	    int playerNumber;
	    double record;
	    player(int playerNumber, double time){
	        this.playerNumber = playerNumber;
	        this.record = time;
	    }
	    public String toString(){
	        return  playerNumber + " " + record;
	    }
	    public int compareTo(player o) {
	    	return new Double(record).compareTo(o.record);
	    }
}
	