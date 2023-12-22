import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int[] a = {1,4,8,16,32,64,128,256,512,9,27,81,243,729,25,125,625,49,343,121,169,289,361,529,841,961,36,216,100,1000,144,196,225,256,324,400,441,484,576,676,784,900};
  int x = sc.nextInt();
  Arrays.sort(a);
  for(int i = a.length-1;i >= 0;i--){
    if(a[i] <= x){
      System.out.println(a[i]);
      break;
    }
  }
}}
