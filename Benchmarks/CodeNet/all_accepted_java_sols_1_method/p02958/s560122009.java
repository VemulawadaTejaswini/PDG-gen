import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    int a=0;
    int b=0;
    int n=sc.nextInt();
    int syo[]=new int[n];
    for(int i=0;i<n;i++){
      syo[i]=i+1;
    }
    int p[]=new int[n];
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
      if(syo[i]!=p[i]){
        count++;
      }
    }

    if(count==0){
      System.out.println("YES");
    }

    if(count==2){
      for(int i=0;i<n;i++){
        if(syo[i]!=p[i]){
          a=i;
          break;
        }
      }
      for(int i=a;i<n;i++){
        if(syo[i]!=p[i]){
          b=i;
        }
      }
      if(p[a]==syo[b] && p[b]==syo[a]){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

    if(count!=0 && count!=2){
      System.out.println("NO");
    }

  }
}