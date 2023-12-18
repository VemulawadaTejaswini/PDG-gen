import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    int N = sc.nextInt();
    int a[]=new int[10001];
    int b[]=new int[10001];
    int c[]=new int[10001];
    
    for(int x=1;x<100;x++){
      for(int y=x;y<100;y++){
        for(int z=y;z<100;z++){
          int answer=((x+y)*(x+y)+(y+z)*(y+z)+(z+x)*(z+x))/2;
          if(answer<10001){
          	if(x==y&&y==z) a[answer]++;
          	else if(x==y||y==z) b[answer]++;
          	else c[answer]++;
          }
        }
      }
     }
     
     for(int i=1;i<=N;i++){
       System.out.println(a[i]+b[i]*3+c[i]*6);
     }
    
  }
}