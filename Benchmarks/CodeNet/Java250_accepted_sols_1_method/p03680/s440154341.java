import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N+1];
    for(int i=1;i<=N;i++){
      a[i]=sc.nextInt();
    }
    int answer=0;
    int lightNum=1;
    while(1==1){
      lightNum=a[lightNum];
      answer++;
      if(lightNum==2){
        System.out.println(answer);
        return;
      }
      if(answer>110000){
        System.out.println(-1);
        return;
      }
    }
      
  }
  

  
}
