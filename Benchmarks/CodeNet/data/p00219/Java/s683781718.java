import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);

    void run(){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n==0) break;

	    int[] ice = new int[10];
	    for(; n>0; n--){
		ice[kbd.nextInt()]++;
	    }

	    for(int i=0; i<ice.length; i++){
		if(ice[i]==0)
		    System.out.println("-");
		else{
		    while(ice[i]>0){
			System.out.print("*");
			ice[i]--;
		    }
		    System.out.println();
		}
	    }
	}
    }
}