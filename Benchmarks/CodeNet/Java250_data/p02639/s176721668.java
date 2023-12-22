import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int[] x={1,2,3,4,5};
      int[] inx=new int[5];
      for(int i=0;i<5;i++){
         inx[i]=sc.nextInt();
      }
      for(int j=0;j<5;j++){
         if(inx[j]==0){
            System.out.println(x[j]);
         }
      }
   }
}
