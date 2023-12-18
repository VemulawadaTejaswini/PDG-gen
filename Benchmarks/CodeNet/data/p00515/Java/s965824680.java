import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int sum;

    void run(){
	while(sc.hasNext()){
	    sum = 0;
	    for(int i=0; i<5; i++){
		int x = sc.nextInt();
		if(x<40) sum+=40;
		else sum+=x;
	    }
	    System.out.println(sum/5);
	}
    }
}