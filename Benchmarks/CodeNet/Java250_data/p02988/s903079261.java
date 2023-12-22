import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] array = new int[num];
      int count = 0;
      for(int i = 0;i < array.length;i++){
      	array[i] = sc.nextInt();
      }
      for(int j = 1;j < array.length-1;j++){
      	if((array[j-1] < array[j] && array[j] < array[j+1])||(array[j-1] > array[j] && array[j] > array[j+1])){
        count++;
        }
      }
      System.out.println(count);
    }
}
