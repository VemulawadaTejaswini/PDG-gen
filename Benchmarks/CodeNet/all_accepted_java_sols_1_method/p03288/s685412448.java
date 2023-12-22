import java.util.Scanner;

class Main{

public static void main(String[] args){
Scanner stdIn = new Scanner(System.in);
int s = stdIn.nextInt();
if(s >= 0 &&  s <= 1199) 
System.out.println("ABC");

else if(s >=1200 && s <= 2799)
System.out.println("ARC");

else if(s >= 2800 && s <= 4208)
System.out.println("AGC");
}
}