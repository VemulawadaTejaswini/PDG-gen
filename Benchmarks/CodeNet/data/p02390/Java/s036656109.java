import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
int S = scanner.nextInt();
int h = S/3600;
int x = S%3600;
int m = x/60;
int s = x%60;
System.out.println(h + ":" + m + ":" + s);
}
}
