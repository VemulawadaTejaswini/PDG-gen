import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X >= 400 && X <= 599) {
        	System.out.println("8級");
        }else if(X >= 600 && X <= 799) {
        	System.out.println("7級");
        }else if(X >= 800 && X <= 999) {
        	System.out.println("6級");
        }else if(X >= 1000 && X <= 1199) {
        	System.out.println("5級");
        }else if(X >= 1200 && X <= 1399) {
        	System.out.println("4級");
        }else if(X >= 1400 && X <= 1599) {
        	System.out.println("3級");
        }else if(X >= 1600 && X <= 1799) {
        	System.out.println("2級");
        }else if(X >= 1800 && X <= 1999) {
        	System.out.println("1級");
        }
	}
}