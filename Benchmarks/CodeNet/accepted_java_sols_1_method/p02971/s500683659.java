import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     ArrayList <Integer> li = new ArrayList <Integer>();
    for(int i=0; i<n; i++){
      int a = sc.nextInt();
      li.add(a);
    }
    int bigger = li.get(0);
    for(int i=1;i<n;i++){
      int a = Math.max(bigger,li.get(i));
      bigger = a;
    }
    int maxNumber=0;
    int m=0;
    for(int i=0;i<n;i++){
      if(li.get(i)==bigger){
        maxNumber++;
        m = i;
      }
    }
    if(maxNumber>1){
      for(int i=0;i<n;i++){
        System.out.println(bigger);
      }
    }else if(m==0&&n==2){
          System.out.println(li.get(1));
          System.out.println(bigger);
    }else if(m==0){
          int semiMax = li.get(1);
          for(int i=2;i<n;i++){
            int a = Math.max(semiMax,li.get(i));
            semiMax = a;
          }
        System.out.println(semiMax);
        for(int i=1;i<n;i++){
          System.out.println(bigger);
        }     
    }else{
        int semiMax = li.get(0); 
        for(int i=1;i<n;i++){
          if(i==m){
            continue;
          }else{
            int a = Math.max(semiMax,li.get(i));
            semiMax = a;
          }
        }
        for(int i=0;i<n;i++){
          if(i==m){
            System.out.println(semiMax);
          }else{
            System.out.println(bigger);
          }
        }
    }
  }
}
