import java.util.*;

public class Main{

public static void main(String [] args){

       Scanner sc = new Scanner(System.in);

String x = leftstring(sc,1);
String y = rightstring(sc,1);


int a = x.nextInt();
int b = y.nextInt();

System.out.println((a*b) + " " + (2*(a+b)));

}
}



