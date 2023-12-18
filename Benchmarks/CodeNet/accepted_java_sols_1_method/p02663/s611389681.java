import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HourA = sc.nextInt();
        int MinuteA = sc.nextInt();
        int HourB = sc.nextInt();
    	int MinuteB = sc.nextInt();
		int K   = sc.nextInt();
		int minute = 0;
		
		minute += MinuteB;
		
		if(MinuteA < 60){
		    minute += 60 - MinuteA;
		    HourA++;
		}
		
		minute += (HourB-HourA) * 60;
		

        System.out.println(minute-K);
    }
}