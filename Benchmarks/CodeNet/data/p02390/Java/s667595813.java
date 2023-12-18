import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int time = in.nextInt();

	int h = time/(60*60);
	int m = time/60%60;
	int s = time%60;

	System.out.println(h+":"+m+":"+s);
    }
}
	

