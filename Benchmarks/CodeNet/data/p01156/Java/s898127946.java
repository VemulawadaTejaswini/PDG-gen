import java.util.Scanner;

public class Main{
    class Hand{
	String str;
	int type;
	boolean res = false;
	int draw=0;
	int w1, w2;

	Hand(){
	}
	Hand(String str, int type, int w1, int w2){
	    this.str = str;
	    this.type = type;
	    this.w1 = w1;
	    this.w2 = w2;
	}

	void tcount(Hand a[], int n){
	    int win = 0, lose = 0;
	    if(w1 < w2){
		for(int i = 0; i < n; i++){
		    if(a[i].type == this.type){
			draw++;
		    } else if(w1 <= a[i].type && a[i].type <= w2){
			lose++;
		    } else {
			win++;
		    }
		}
	    } else {
		for(int i = 0; i < n; i++){
		    if(a[i].type == this.type){
			draw++;
		    } else if(w1 >= a[i].type || a[i].type <= w2){
			lose++;
		    } else {
			win++;
		    }
		}
	    }
	    if(lose == 0){
		res = true;
	    }
	}
    }

    public Main(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n == 0){
		break;
	    }
	    Hand hand[] = new Hand[n];

	    for(int i = 0; i < n; i++){
		String str = sc.next();
		if(str.equals("Rock")){
		    hand[i] = new Hand(str, 0, 8, 14);
		} else if(str.equals("Fire")){
		    hand[i] = new Hand(str, 1, 9, 0);
		} else if(str.equals("Scissors")){
		    hand[i] = new Hand(str, 2, 10, 1);
		} else if(str.equals("Snake")){
		    hand[i] = new Hand(str, 3, 11, 2);
		} else if(str.equals("Human")){
		    hand[i] = new Hand(str, 4, 12, 3);
		} else if(str.equals("Tree")){
		    hand[i] = new Hand(str, 5, 13, 4);
		} else if(str.equals("Wolf")){
		    hand[i] = new Hand(str, 6, 14, 5);
		} else if(str.equals("Sponge")){
		    hand[i] = new Hand(str, 7, 0, 6);
		} else if(str.equals("Paper")){
		    hand[i] = new Hand(str, 8, 1, 7);
		} else if(str.equals("Air")){
		    hand[i] = new Hand(str, 9, 2, 8);
		} else if(str.equals("Water")){
		    hand[i] = new Hand(str, 10, 3, 9);
		} else if(str.equals("Dragon")){
		    hand[i] = new Hand(str, 11, 4, 10);
		} else if(str.equals("Devil")){
		    hand[i] = new Hand(str, 12, 5, 11);
		} else if(str.equals("Lightning")){
		    hand[i] = new Hand(str, 13, 6, 12);
		} else {
		    hand[i] = new Hand(str, 14, 7, 13);
		}
	    }
	    for(int i = 0; i < n; i++){
		hand[i].tcount(hand, n);
	    }
	    int f = 0;
	    for(int i = 0; i < n; i++){
		if(hand[i].res){
		    f = 1;
		    System.out.println(hand[i].str);
		    break;
		}
	    }
	    if(f == 0){
		System.out.println("Draw");
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}