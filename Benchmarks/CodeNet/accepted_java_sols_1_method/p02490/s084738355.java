import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a, b, dumy;
	while(true){
	    a = s.nextInt();
	    b = s.nextInt();

	    if(a == 0 && b == 0) break;
	    
	    if(a > b){
		dumy = a;
		a = b;
		b = dumy;
	    }
	    
	    System.out.println(a + " " + b);
	}
    }
}