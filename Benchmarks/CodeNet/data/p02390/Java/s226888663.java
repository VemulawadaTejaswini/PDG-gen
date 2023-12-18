import java.util.Scanner;

public class Time{
    public static void main(String[] args){
	Scanner  stdin = new Scanner(System.in);
	int t = stdin.nextInt();
	int h = t/3600;
	int m = (t-h*3600)/60;
	int s = (t-h*3600)%60;
	System.out.println(h+":"+m+":"+s);
    }
}