import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	double ave=(a+b)/2.0;
	int ans=(int)Math.ceil(ave);
	System.out.println(ans);
    }
}
