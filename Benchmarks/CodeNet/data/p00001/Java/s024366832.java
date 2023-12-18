import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int[] height = new int[10];
    Scanner s = new Scanner(System.in);
    int temp;

    for(int i = 0;i < height.length;i++){
      height[i] = s.nextInt();
    }

    for(int i = 0;i < height.length;i++){
      for(int j = i;j < height.length;j++){
        if(i != j){
          if(height[i] < height[j]){
            temp = height[i];
            height[i] = height[j];
            height[j] = temp;
          }
        }
      }
    }

    for(int i = 0;i < 3;i++){
      System.out.println(height[i]);
    }
  }
}