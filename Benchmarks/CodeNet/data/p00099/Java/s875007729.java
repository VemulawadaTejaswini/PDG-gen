import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int q = scanner.nextInt();

     int[] member = new int[n];

     int m = 0;
     int mn = 0;

     for(int i=0;i<q;i++){
       int a = scanner.nextInt();
       int v = scanner.nextInt();
       member[a-1] += v;

       if(i==0){
         m=member[a-1];
         mn = a-1;
       }else{



         if(v<0){
           mn = most(member);
           m=member[mn];
         }else if((member[a-1]==m)&&(mn > a-1)){
           mn = a-1;
         }else if(m < member[a-1]){
           m=member[a-1];
           mn = a-1;
         }





       }

       System.out.println((mn+1) + " " + m);

     }

  }

static int most(int[] member){
    int m = member[0];
    int n = 0;
    for(int i=1;i<member.length;i++){
      if(m<member[i]){
        m=member[i];
        n=i;
      }
    }
    return n;
  }

}
