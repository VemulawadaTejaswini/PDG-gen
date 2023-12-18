import java.util.*;
class aoj10004{
    public static void main(String args[]){
	int x[];
	x = new int[3];
	Scanner cin = new Scanner(System.in);
	x[0] = cin.nextInt();
	x[1] = cin.nextInt();
	x[2] = cin.nextInt();
	Arrays.sort(x);
	System.out.println(x[0]+" "+x[1]+" "+x[2]);
    }
}