import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int min, in, out, inside, ans;
    boolean er = false;

    void run(){
	min = sc.nextInt();
	inside = sc.nextInt();
	ans = inside;
	for(int i=0; i<min; i++){
	    in = sc.nextInt();
	    out = sc.nextInt();
	    inside = inside + in - out;
	    if(inside<0){
		er = true;
		ans = 0;
	    }
	    if(!er && ans<inside)
		ans = inside;
	}
	System.out.println(ans);
    }
}