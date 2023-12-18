import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int S = scanner.nextInt();
System.out.println((S/3600)+":"+((S%3600)/60)+":"+(S%60));
}
}