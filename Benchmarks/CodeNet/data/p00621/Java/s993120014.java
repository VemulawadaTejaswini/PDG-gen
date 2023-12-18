import java.until.Scanner;

class Main{

    Main(){
	readscores();
	showResult();
	System.out.println("END");
    }

    void readscores(){
	scanner sc = new Scanner(System.in);
	while(sc.hasNext){
	    int W = sc.nextInt();
	    int Q = sc.nextInt();
	}
	while(sc.hasNext){
	    String c  = sc.nextInt();
	    int id = sc.nextInt();
	    int w = sc.nextInt();
	}
    }

    void showResult(){
	if(W = 0 && Q = 0) break;
	else if(w <= W && c = "s"){
	    W = W - w;
	    System.out.println(W);
	}
	else if(w > W && c = "s"){
	    System.out.println("impossible");
	}
	else if(c = "w"){
	    W = W + w;
	}
    }

    public static void main(String[] args){
	new Main();
    }
}