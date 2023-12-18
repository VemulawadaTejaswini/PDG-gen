import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a, b, c, dumy;
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();
	
	for(int i = 0 ; i < 2 ; i++){
	if(a > b){
	    dumy = a;
	    a = b;
	    b = dumy;
	}
	if(b > c){
	    dumy = b;
	    b = c;
	    c = dumy;
	}
	if(a > c){
	    dumy = a;
	    a = c;
	    c = dumy;
	}
	}
	System.out.println(a + " " + b + " " + c);
    }
}