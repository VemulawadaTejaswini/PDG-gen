import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	Long N = Long.parseLong(stdIn.next());
	Long A = Long.parseLong(stdIn.next());
	Long B =  Long.parseLong(stdIn.next());
	Long k = N/(A+B)*A;
	Long n =N%(A+B);
	Long j=Math.min(n,A);
	System.out.println(k+j);
    }
}
