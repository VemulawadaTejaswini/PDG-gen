import java.io.*;
import java.util.Scanner;
public class Main{ 
  public static void main(String[]args){ 
    Scanner sc = new Scanner(System.in);
    while(true){
    int n = sc.nextInt(); 
    if(n==0){
      break;
    }
    int i,max=0,min=1000,Sum=0,Ave;
    int [] s=new int[n];
    for(i=0;i<n;i++){
      s[i]=sc.nextInt();
      if(s[i]>max){
        max=s[i];
      }
      if(s[i]<min){
        min=s[i];
      }
      Sum = Sum + s[i];
    }
    Ave = (Sum - (max + min))/(n-2);
    System.out.printf("%d\n",Ave);
    }
  }
}  