import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    void run(){
	while(sc.hasNext()){
	    String[] s = sc.nextLine().split(",");
	    double w = Double.parseDouble(s[1]);
	    double h = Double.parseDouble(s[2]);
	    double bmi = w/h/h;
	    if(bmi>=25)
		System.out.println(s[0]);
	}
    }
}