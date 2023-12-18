import java.util.Scanner;

public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
         int hours_int,minutes_int,second_int;
        float hours_float,minutes_float,exchange,exchange2,theSecond;
        
		float seconds = scan.nextFloat();
                                     hours_float = seconds / 3600;
                                     hours_int = (int) hours_float;
                                     exchange= hours_float-(float) hours_int ;
                                     minutes_float = exchange * 60;
                                     minutes_int = (int) minutes_float;
                                     exchange2 = minutes_float - (float) minutes_int;
                                     theSecond =exchange2 * 60;
                                     second_int = (int) Math.round(theSecond);
                                     System.out.printf("%d:%d:%d\n",hours_int,minutes_int,second_int);
        	 
    }
}
