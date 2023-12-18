import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n, m;
	for(n=1; n<=9; n++){
	    for(m=1; m<=9; m++){
		System.out.println(n+"x"+m+"="+n*m);
	    }
	}
    }
}