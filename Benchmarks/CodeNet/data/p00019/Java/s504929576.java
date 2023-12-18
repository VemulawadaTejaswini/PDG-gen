import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int ans = sub(n);
	System.out.println(ans);
    }
    
    public static int sub(int n){
	if(n > 0){
	    return n * sub(n-1);
	}
	else{
	    return 1;
	}
    }
}