import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner a = new Scanner(System.in);
		
	int S = a.nextInt();
	int h = S/3600;
	int m = (S % 3600)/60;
	int s = S- (h*3600+m*60);
	System.out.println(h + ":" + m + ":" + s);
    }
}