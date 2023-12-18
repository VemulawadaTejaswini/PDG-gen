import java.util.*;

class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[m+1];
    int b[] = new int[m+1];
    int answer = 0;
    int maxb = -1;
    int maxidx = -1;
    int work = 1;
    boolean flag = true;
    for(int i = 1; i <= m; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    while(work < n){
	  maxb = -1;
      for(int i = 1; i <= m; i++){
        if(a[i] <= work){
          if(b[i] > maxb){
            maxb = b[i];
            maxidx = i;
          }
        }
      }
      if(maxb == -1){
        flag = false;
        break;
      }else{
        answer++;
        work = maxb;
        a[maxidx] = 101;
        b[maxidx] = 101;
      }
    }
    if(flag){
      System.out.println(answer);
    }else{
      System.out.println("Impossible");
    }
  }
}

