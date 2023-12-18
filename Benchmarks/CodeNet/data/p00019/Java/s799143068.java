import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	long n = scan.nextInt();
	long ans = sub(n);
	System.out.println(ans);
    }
    
    public static long sub(long n){
	if(n > 0){
	    return n * sub(n-1);
	}
	else{
	    return 1;
	}
    }
}