import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);

    void run(){
	int days = kbd.nextInt();
	int jap = kbd.nextInt();
	int math = kbd.nextInt();
	int maxJ = kbd.nextInt();
	int maxM = kbd.nextInt();

	while(jap>0 || math>0){
	    jap -= maxJ;
	    math -= maxM;
	    days--;
	}
	System.out.println(days);
    }
}