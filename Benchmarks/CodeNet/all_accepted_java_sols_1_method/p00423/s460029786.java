import java.util.*;

public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int a, b;
		int sumA = 0;
		int sumB = 0;
		for(; n>0; n--){
		    a = kbd.nextInt();
		    b = kbd.nextInt();
		    if(a>b) sumA += (a+b);
		    else if(b>a) sumB += (a+b);
		    else {
			sumA += a;
			sumB += b;
		    }
		}
		System.out.println(sumA+" "+sumB);
	    }
	}
    }
}