import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] a = new char[h+1][];
      for(int i = 0;i < h;i++){
        	a[i] = sc.next().toCharArray();
      }
  	  for(int i = 0;i < w+2;i++){System.out.print('#');}
      System.out.println("");
      for(int i = 0;i < h;i++){
        System.out.print('#');
      	for(int j = 0;j < w;j++){
        	System.out.print(a[i][j]);
        }
        System.out.print('#');
        System.out.println("");
      }
      
      for(int i = 0;i < w+2;i++){System.out.print('#');}
    }
}
