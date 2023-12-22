import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	long a,b;
	while(stdIn.hasNextInt()){
	    a = stdIn.nextInt();
	    b = stdIn.nextInt();
	    System.out.printf("%d %d\n",GCD(a , b),LCM(a , b));
	}
    }
    public static long GCD(long a,long b){
	if(b == 0) return a;
	else return GCD(b , a % b);
    }
    public static long LCM(long a,long b){
	return a*b / GCD(a , b);
    }
}