import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[9];
    for(int i = 0; i < 9; i++){
      a[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      int b = sc.nextInt();
      for(int j = 0; j < 9; j++){
        if(a[j] == b){
          a[j] = -1;
        }
      }
    }
    for(int i = 0; i < 3; i++){
      if(a[i*3+0]==-1&&a[i*3+1]==-1&&a[i*3+2]==-1){
        System.out.println("Yes");
        return;
      } else if(a[i+0*3]==-1&&a[i+1*3]==-1&&a[i+2*3]==-1){
        System.out.println("Yes");
        return;
      }
    }
    if(a[0]==-1&&a[4]==-1&&a[8]==-1){
      System.out.println("Yes");
      return;
    } else if(a[2]==-1&&a[4]==-1&&a[6]==-1){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}