import java.util.*;

public class Main {
    public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
   
	int gohyaku = X/500;
	int goen =(X-(gohyaku*500))/5;

      System.out.println(1000*gohyaku + 5*goen);

    }
}