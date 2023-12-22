import java.util.Scanner;

public class Main{


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int Time = sc.nextInt();
    	int h = Time / 60 / 60;
    	int m = Time / 60 - h * 60;
    	int s = Time - m * 60 - h * 60 * 60;
        System.out.println(h + ":" + m + ":" + s);
        sc.close();
    }

}