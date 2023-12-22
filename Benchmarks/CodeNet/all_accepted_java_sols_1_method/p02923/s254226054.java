import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int h[]=new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    sc.close();
    int counter=0;
    int max=0;
    for(int i=0;i<n-1;i++){
      if(h[i]>=h[i+1]){
        counter++;
        if(counter>max){
          max=counter;
        }
      }else{
        counter=0;
      }
    }
    System.out.print(max);
  }
}