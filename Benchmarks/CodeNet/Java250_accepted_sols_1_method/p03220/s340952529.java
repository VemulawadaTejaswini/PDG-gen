import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int kosu = sc.nextInt(),ond = sc.nextInt(),base = sc.nextInt();
        
      	int ans = -1;
      	double mm =Double.MAX_VALUE;
        for(int i=0;i < kosu;i++){
			double nam = Math.abs(base-(ond-0.006*sc.nextInt()));
			    if(nam <mm ) {
				        mm = nam;
				        ans = i + 1;
			}
      }
        System.out.println(ans);
    }
}
