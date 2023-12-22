import java.util.*;

public class Main {
 	public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int loop;
      loop = sc.nextInt();
      
      int [] arr_i = new int [loop];
      
      for(int i = 0; i < loop; i++) {
        	arr_i[i] = sc.nextInt();
      }
      
      sc.close();
     
      ArrayList<Integer> arr_num = new ArrayList<Integer>();
      
     for(int i = 0; i < loop; i++) {
      	if(arr_i[i] % 2 == 0) {
           arr_num.add(arr_i[i]);
        }
     }
      
     int g = 0;
     int ng = 0;
     for(Integer i : arr_num) {
      		if(i % 3 == 0 || i % 5 == 0) {
             	  g++;
            } else {
                  ng++;
            }
     }
      
     if(ng > 0) {
        System.out.print("DENIED");
     } else {
        System.out.print("APPROVED");
     }
     

	}
}
