import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    int A = Integer.parseInt(scan.next()); //冷蔵庫    
    int B = Integer.parseInt(scan.next()); //電子レンジ
    int M = Integer.parseInt(scan.next()); //割引
    
    int[] ref = new int[A]; //冷蔵
    int[] mic = new int[B]; //レンジ
    
    //冷蔵庫の値段入れる
    for(int i = 0; i < A;i++){
      ref[i] = Integer.parseInt(scan.next());
    }
    
    //レンジの値段入れる
    for(int i = 0; i < B;i++){
      mic[i] = Integer.parseInt(scan.next());
    }
    
    int cost;
    
    int min_ref = 100001;
    int min_mic = 100001;
    
    
    for(int i = 0; i < A;i++){
      if(ref[i] < min_ref){
        min_ref = ref[i];
      }
    }
    for(int i = 0; i < B;i++){
      if(mic[i] < min_mic){
        min_mic = mic[i];
      }
    }
    
    cost = min_ref + min_mic;
    
    for(int i = 0; i < M ;i++){
      int point_a = Integer.parseInt(scan.next());
      int point_b = Integer.parseInt(scan.next());
      int discount = Integer.parseInt(scan.next());
      
      int tmp = ref[(point_a - 1)] + mic[(point_b - 1)] - discount;
      
      if(tmp < cost){
        cost = tmp;
      }
    }
    
    System.out.println(cost);
  }
}
