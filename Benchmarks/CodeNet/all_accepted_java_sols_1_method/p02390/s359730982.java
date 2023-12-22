import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	int timeSec = sc.nextInt();
	
	int timeHour = timeSec / 3600;
	timeSec %= 3600;
	
	int timeMin = timeSec / 60;
	timeSec %= 60;
	
	System.out.println(timeHour + ":" + timeMin + ":" + timeSec);
    }
}