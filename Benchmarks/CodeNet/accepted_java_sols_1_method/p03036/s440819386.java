import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int nam = 0;
      
      for(int i=0; i<10;i++){
        nam = (A*X)-D;
        System.out.println(nam);
        X = nam;
      }

      
      

	}
}
