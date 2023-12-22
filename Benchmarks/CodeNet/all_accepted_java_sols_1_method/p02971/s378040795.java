import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        Integer nam[] = new Integer[N];
        int max1 = 0;int max2 = 0;
      
      for(int i = 0;i < N ; i++){nam[i] =  in.nextInt();}
      
      Integer[] nam2 = nam.clone();
      Arrays.sort(nam, Collections.reverseOrder());
      max1 = nam[0];max2 = nam[1];
      
      for(int i = 0;i < N ; i++){
        if(nam2[i]!=max1){System.out.println(max1);}
        else{System.out.println(max2);}
        
      }
	}
}