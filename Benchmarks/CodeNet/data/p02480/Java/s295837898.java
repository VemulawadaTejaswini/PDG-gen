import java.util.*;

class Main{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
	int a = s.nextInt();
	int res = 1;
	for(int i = 0 ; i < 3 ; i++){
	    res *= a;
	}
	System.out.println(res);
    }
}