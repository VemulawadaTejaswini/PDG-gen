import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean[] use;
    int[] hand;
    int uc;

    void run(){
	while(sc.hasNext()){
	    use = new boolean[4];
	    hand = new int[5];
	    hand[0] = sc.nextInt();
	    use[hand[0]] = true;
	    uc = 1;

	    if(hand[0]==0) break;
	    for(int i=1; i<hand.length; i++){
		hand[i] = sc.nextInt();
		if(!use[hand[i]]){
		    use[hand[i]] = true;
		    uc++;
		}
	    }

	    if(uc==1 || uc==3){
		for(int i=0; i<5; i++)
		    System.out.println("3");
	    }
	    else{
		if(use[1] && use[2])
		    show(1, 2);
		else if(use[2] && use[3])
		    show(2, 3);
		else if(use[3] && use[1])
		    show(3, 1);
	    }
	}
    }

    void show(int win, int lose){
	for(int i=0; i<hand.length; i++)
	    System.out.println(hand[i]==win ? "1":"2");
    }
}