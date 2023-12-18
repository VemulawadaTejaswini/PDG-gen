import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[] numbers=new int[n];
    for(int i=0;i<numbers.length;i++){
      numbers[i]=Integer.parseInt(scan.next());
    }

    int count=0;
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==2){
        count++;
        continue;
      }else if(numbers[i]<2 || numbers[i]%2==0){
        continue;
      }
      int j=3;
      while(j<=Math.sqrt(numbers[i])){
        if(numbers[i]%j==0){
          break;
        }
        j+=2;
      }
      if(j>Math.sqrt(numbers[i])){
        count++;
      }
    }
    System.out.println(count);
  }
}
