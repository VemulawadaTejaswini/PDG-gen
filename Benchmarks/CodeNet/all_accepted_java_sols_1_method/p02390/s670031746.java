import java.util.Scanner;

public class Main {

public static void main(String[] args){
Scanner input = new Scanner(System.in);
int tot = input.nextInt();
int hours = tot / 3600;
tot = tot - (hours*3600);
int mins = tot / 60;
tot = tot - (mins * 60);
System.out.println(hours+":"+mins+":"+tot);

}
}
