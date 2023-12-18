import java.util.*;

public class Main{
  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  int[] data = {0,0,0};
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
     data[0] = a;
     data[1] = b;
     data[2] = c;
     for(int i = 0; i <data.length-1; i++){
       for(int j = i+1; j <data.length; j++){
         if(data[i] > data[j]){
           int k = data[i];
           data[i] = data[j];
           data[j] = k;
         }
       }
     }
     for(int i = 0; i < data.length-1; i++){
       System.out.print(data[i] + " ");
     }
     System.out.print(data[2]);
     System.out.print("\n");
     }
   }


