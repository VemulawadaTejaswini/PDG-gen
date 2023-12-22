import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	int d = 100000;

	while(n>0) {
	    d = (int)(d*1.05);
	    if(d%1000 != 0){
		d = d/1000;
		d++;
		d = d*1000;
	    }
	    n--;
	}

	System.out.println(d);
    }   
}