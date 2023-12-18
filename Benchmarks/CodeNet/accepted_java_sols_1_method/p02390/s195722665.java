import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String st = scan.next();
	int t = Integer.parseInt(st);
	int h = t/3600;
	int m = (t - (t / 3600) * 3600) / 60;
	int s = (t % 60);
	System.out.println(h + ":" + m + ":" + s);
    }
}

