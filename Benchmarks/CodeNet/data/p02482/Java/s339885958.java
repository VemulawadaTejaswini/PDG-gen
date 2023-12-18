import java.util.*;

class Main{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
	int a,b;
	a = s.nextInt();
	b = s.nextInt();
	
	if(a > b)System.out.println("a > b");
	else if(a < b)System.out.println("a < b");
	else System.out.println("a == b");
    }
}