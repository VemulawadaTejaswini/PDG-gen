import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		int sum = 0;
		int t = n/4;
		for(; t>0; t--){
		    sum += kbd.nextInt();
		}
		System.out.println(sum);
	    }
	}
    }
}