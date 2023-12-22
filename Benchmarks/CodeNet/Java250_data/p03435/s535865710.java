import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
      int check = 0;
      int[] a = new int[9];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      int x1 = 0;
      int x2 = 0;
      int y1 = 0;
      int y2 = 0;
      x1 = a[3] - a[0];
      x2 = a[6] - a[3];
      y1 = a[1] - a[0];
      y2 = a[2] - a[1];
      
      if(a[4] != a[1]+x1){
        check=1;
      } if(a[5] != a[2]+x1){
        check=1;
      } if(a[7] != a[4]+x2){
        check=1;
      } if(a[8] != a[5]+x2){
        check=1;
      }
      
      if(check==0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}
