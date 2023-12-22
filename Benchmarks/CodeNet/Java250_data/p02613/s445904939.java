import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();  
		for (int i=0; i < N ;i++){
			String S = in.next();
				if (S.equals("AC")){
					sum1= sum1 +1;
				}
				else if (S.equals("WA")){
					sum2= sum2 +1;
				}
      			else if (S.equals("TLE")){
					sum3= sum3 +1;
				}
      			else if (S.equals("RE")){
					sum4= sum4 +1;
				}
        }
      System.out.println("AC x " + sum1);
      System.out.println("WA x " + sum2);
      System.out.println("TLE x " + sum3);
      System.out.println("RE x " + sum4);
	}
}