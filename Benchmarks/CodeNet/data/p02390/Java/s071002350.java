import java.util.Scanner;

class Main{

public static String hours(int sec){
int min = sec% 3600 / 60;
int seconds = sec % 3600 %36 / 60
int hour = sec / 3600;
return hour + ":" + min + ":" + sec;

}
	
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int p = scanner.nextInt();

System.out.println(hours(p));

}
}

