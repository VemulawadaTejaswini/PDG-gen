import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int H = sc.nextInt();
      	int M = sc.nextInt();
      	if(H == 0) H = 12;
		double H2 = (H * 60 + M) * 0.5;
        double M2 = M * 6;
      	if (M2 == 0) M2 = 360;
      	double kakudo = 0;
      	if(M2 > H2){
	      kakudo = M2 - H2;
        }
      	else{
          kakudo = H2 - M2;
    	}
      	
      	kakudo = Math.min(kakudo,360-kakudo);
      	//System.out.println(kakudo);
      	
         double cos = Math.cos(Math.toRadians(kakudo));
      	 double ans = Math.sqrt((A*A)+(B*B)-(2*A*B*cos));

         System.out.println(ans);
    }
}