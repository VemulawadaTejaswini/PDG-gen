import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		player player1[] = new player[7];
		player player2[] = new player[7];
		player player3[] = new player[7];
        for(int i=0; i<7; i++)player1[i] = new player(sc.nextInt() , sc.nextDouble());
        for(int i=0; i<7; i++)player2[i] = new player(sc.nextInt() , sc.nextDouble());
        for(int i=0; i<7; i++)player3[i] = new player(sc.nextInt() , sc.nextDouble());
        
        Arrays.sort(player1);
        System.out.println(player1[0] + "\n" + player1[1]);
        player1[0].record = 50;
        player1[1].record = 50;
         
        Arrays.sort(player2);
        System.out.println(player2[0] + "\n" + player2[1]);
        player2[0].record = 50;
        player2[1].record = 50;
         
        Arrays.sort(player3);
        System.out.println(player3[0] + "\n" + player3[1]);
        player3[0].record = 50;
        player3[1].record = 50;
        
        Arrays.sort(player1);
        Arrays.sort(player2);
        Arrays.sort(player3);
        player player4[]= new player[6];
        player4[0] = new player(player1[0].playerNumber,player1[0].record);
        player4[1] = new player(player1[1].playerNumber,player1[1].record);
        player4[2] = new player(player2[0].playerNumber,player2[0].record);
        player4[3] = new player(player2[1].playerNumber,player2[1].record);
        player4[4] = new player(player3[0].playerNumber,player3[0].record);
        player4[5] = new player(player3[1].playerNumber,player3[1].record);
        Arrays.sort(player4);
        System.out.println(player4[0] + "\n" + player4[1]);
    }
}
	class player implements Comparable<player>{
		int playerNumber;
	    double record;
	    player(int playerNumber, double record){
	        this.playerNumber = playerNumber;
	        this.record = record;
	    }
	    public String toString(){
	        return  playerNumber + " " + record;
	    }
	    public int compareTo(player o) {
	    	return new Double(record).compareTo(o.record);
	    }
}