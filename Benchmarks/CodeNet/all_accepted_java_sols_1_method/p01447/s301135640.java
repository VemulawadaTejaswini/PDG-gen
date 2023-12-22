import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	int cnt = 0;
	int c = 0;
	while(n>=3){ 
	    while(n%3 != 0) {
		n++;
	    }
	    n = n/3;
	    cnt++;
	}
	if(n==2){
	    cnt++;
	}
	System.out.println(cnt);
    }
}