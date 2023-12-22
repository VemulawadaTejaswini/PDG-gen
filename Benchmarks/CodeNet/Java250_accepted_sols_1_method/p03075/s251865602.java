import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for(int s=0;s<5;s++){
      a[s]=sc.nextInt();
    }
    int count=0;
    int k=sc.nextInt();
    for(int s=0;s<4;s++){
      for(int l=s+1;l<5;l++){
        if(a[l]-a[s]>k){
          count++;
        }
      }
    }
    if(count>0){
      System.out.println(":(");
    }else{
      System.out.println("Yay!");
    }
  }
}