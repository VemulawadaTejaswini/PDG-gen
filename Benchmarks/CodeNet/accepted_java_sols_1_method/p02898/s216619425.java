import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner kbd=new Scanner(System.in);
    int n=kbd.nextInt();//the number of people
    int k=kbd.nextInt();//regular height(cm)
    int h[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++){
      h[i]=kbd.nextInt();
      if(h[i]>=k){
        count++;
      }
    }
    System.out.println(count);
  }
}
