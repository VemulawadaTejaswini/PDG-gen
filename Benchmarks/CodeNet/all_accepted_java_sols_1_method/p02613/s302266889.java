import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
      int N = sc.nextInt();
     
      String A = "AC";
      String B = "WA";
      String C = "TLE";
      String D = "RE";
     
      int C0 = 0;
      int C1 = 0;
      int C2 = 0;
      int C3 = 0;
     
     
      for(int i=0; i<=N; i++) {
       String H = sc.nextLine();
       if(H.equals(A)) {
				C0++;
			}else if(H.equals(B)) {
				C1++;
			}else if(H.equals(C)) {
				C2++;
			}else if(H.equals(D)) {
				C3++;
			}
      }
        System.out.println("AC x " + C0);
		System.out.println("WA x " + C1);
		System.out.println("TLE x " + C2);
		System.out.println("RE x " + C3);
   }
}
