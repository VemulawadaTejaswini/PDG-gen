import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
      	int year;
        double rate=0.01;
        long money=100;
          for(year=0; money < X; year++){
      			money += Math.floor((double)money*rate);
    	}
		
		System.out.println(year);
			
		}
    }