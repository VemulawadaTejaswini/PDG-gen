import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner kbd = new Scanner(System.in);
	int[] x = new int[3];
	x[0] = kbd.nextInt();
	x[1] = kbd.nextInt();
	x[2] = kbd.nextInt();
	Arrays.sort(x);
	System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}