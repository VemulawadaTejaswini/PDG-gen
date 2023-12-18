import java.util.*;
import java.lang.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    Player[] ply = new Player[18];
	    for(int j = 0; j < 3; j++){
		Player[] tmp = new Player[8];
		for(int i = 0; i < 8; i++)
		    tmp[i] = new Player(sc.nextInt(), sc.nextDouble());
		Arrays.sort(tmp);
		tmp[0].print();
		tmp[1].print();
		System.arraycopy(tmp, 2, ply, j*6, 6);
	    }
	    
	    Arrays.sort(ply);
	    ply[0].print(); 
	    ply[1].print();
	}
    }
    
    public static void main(String[] args){
	new Main();
    }
}

class Player implements Comparable{
    public int id;
    public double tm;

    public Player(){
	this.id = 0;
	this.tm = 0;
    }

    public Player(int id, double tm){
	this.id = id;
	this.tm = tm;
    }

    public int compareTo(Object obj){
	Player ply = (Player)obj;

	if(this.tm > ply.tm) return 1;
	if(this.tm < ply.tm) return -1;
	return 0;
    }
    
    public void print(){
	System.out.println(String.valueOf(this.id)+" "+String.valueOf(this.tm));
	return ;
    }
}