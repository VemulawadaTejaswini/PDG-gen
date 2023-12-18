import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] array=new int[3];
    int[] copy=new int[3];
    for(int i=0; i<3; i++){
      array[i]=sc.nextInt();
      copy[i]=array[i];
    }
    int min =100000;
    for(int i=0; i<3;i++){
      for(int j=0; j<3;j++){
        if(i!=j){
          if((array[i]+copy[j])<min){
            min=array[i]+copy[j];
          }
        }
      }
    }
    System.out.println(min);
  }
}