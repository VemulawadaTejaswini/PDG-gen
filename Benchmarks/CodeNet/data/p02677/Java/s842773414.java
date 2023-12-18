import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int H = sc.nextInt();
      	int M = sc.nextInt();
      	if(H == 0) H = 12;
		int H2 = (H * 60 + M) * 360 / (12 * 60);
        int M2 = M * 360 / 60;
      	if (M2 == 0) M2 = 360;
      	int kakudo = 0;
      	if(M2 > H2){
	      kakudo = M2 - H2;
        }
      	else{
          kakudo = H2 - M2;
    	}
      	
      	kakudo = Math.min(kakudo,360-kakudo);
      	//System.out.println(kakudo);
      	
      	double ans = 0.0;
      	if(kakudo==0){ans = 0;}
      	else{
         floot cos = Math.cos(Math.toRadians(kakudo));
      	 ans = Math.sqrt((A*A)+(B*B)-(2*A*B*cos));
        }
          System.out.println(ans);
    }
}