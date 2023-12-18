import java.util.*;

public class Myon {
    Myon(){}
    
    public static void main(String[] args)
    {
        new Myon().run();
    }
    
    public void run(){
    	Scanner cin = new Scanner(System.in);
    	while(true){
    		int a = cin.nextInt();
    		for(int i=0;i<9;i++) a -= cin.nextInt();
    		System.out.println(a);
    	}
    }
// END CUT HERE
}