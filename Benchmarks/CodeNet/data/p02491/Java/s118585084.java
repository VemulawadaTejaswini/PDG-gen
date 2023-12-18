import java.util.*;

class Main{
    public static void main(String[] args){
	int x, y;
	Scanner sc = new Scanner(System.in);
	x = sc.nextInt();
	y = sc.nextInt();
	System.out.println(x/y);
	System.out.println(x%y);
	System.out.printf("%.5f\n", (float)x/y);
    }
}