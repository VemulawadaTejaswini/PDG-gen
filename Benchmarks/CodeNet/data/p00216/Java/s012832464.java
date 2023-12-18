import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()) {
	    int w = kbd.nextInt();
	    if(w!=-1){
		System.out.println(4280-solve(w));
	    }
	}
    }

    static int solve(int w) {
	int r = 0;
	int bill = 0;
	while(w>=0){
	    bill += cost(w, r);
	    w -= 10;
	    r ++;
	    //System.out.println("p");
	}
	return bill;
    }

    static int cost(int w, int r){
	if(r==0){ return 1150; }
	else if(r==1){ 
	    if(w>=10) return 125*10;
	    else return 125*w;
	}
	else if(r==2){
	    if(w>=10) return 140*10;
	    else return 140*w;
	}
	else if(r>2){
	    if(w>=10) return 160*10;
	    else return 160*w;
	}
	else return 0;
    }
}