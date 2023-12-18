import java.util.*;
 public class Main {
	public static void main(String[] args){
      int x[] = new int[5];

      x[0] = 1;
      x[1] = 0;
      x[2] = 2;
      x[3] = 4;
      x[4] = 3;
      
      for(int i = 0;i < x.length;i++){
       if(x[i] == 0){
          System.out.println(i);
       }
      }
	}
 }



