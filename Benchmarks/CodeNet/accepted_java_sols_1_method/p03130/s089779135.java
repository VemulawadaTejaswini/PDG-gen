import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int[] path = new int[6];
      
        for(int i = 0; i < 6; i++){
          path[i] = sc.nextInt();
        }
      
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
      
        for(int i = 0; i < 6; i++){
          switch(path[i]){
            case 1: c1++;
              break;
            case 2: c2++;
              break;
            case 3: c3++;
              break;
            case 4: c4++;
              break;
          }
        }
 
        if((c2 == 2 && c3 == 2) || (c1 == 2 && c4 == 2)){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
	}
}