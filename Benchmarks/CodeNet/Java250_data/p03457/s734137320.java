import java.util.Scanner;

public class Main {

   	public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in);
   		int n = Integer.parseInt(sc.next());
   		int[][] plan = new int [n][3];
   		int[] planlog = new int [3];

   		for(int i=0;i<n;i++) {
   			plan[i][0] = Integer.parseInt(sc.next());
   			plan[i][1]=Integer.parseInt(sc.next());
   			plan[i][2]=Integer.parseInt(sc.next());
   		}
   		sc.close();
    
   		for(int i=0;i<n;i++) {
   			//time,X,Y差分
   			int absT = plan[i][0] - planlog[0];
   			int absX = Math.abs(plan[i][1] - planlog[1]);
   			int absY = Math.abs(plan[i][2] - planlog[2]);
   			//時間内に移動できるか && とどまることができるか
   			if(absT>=absX+absY&&absT%2==(absX+absY)%2) {
   				//System.out.println(absT+" "+absX+" "+absY);
   				planlog[0]=absT;
   				planlog[1]=absX;
   				planlog[2]=absY;
   			}else{
   				System.out.println("No");
   				return;
   			}
   		}
   		System.out.println("Yes");
   	}
    
}