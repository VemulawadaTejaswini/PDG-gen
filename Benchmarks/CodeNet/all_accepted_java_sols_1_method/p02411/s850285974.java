import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] grade = new int [10000];
    int n = 0;
    for(int i=0;;i++){
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      if(m == -1 && f == -1 && r == -1) break;
      if(m == -1 || f == -1){
        grade[i] = 1;
      }else if(m + f >= 80){
        grade[i] = 5;
      }else if(m + f >= 65){
        grade[i] = 4;
      }else if(m + f >= 50){
        grade[i] = 3;
      }else if(m + f >= 30){
        if(r >= 50){
          grade[i] = 3;
        }else{
          grade[i] = 2;
        }
      }else{
        grade[i] = 1;
      }
      n++;
    }
    for(int i=0;i<n;i++){
      switch(grade[i]){
        case 5:
          System.out.println("A");
          break;
        case 4:
          System.out.println("B");
          break;
        case 3:
          System.out.println("C");
          break;
        case 2:
          System.out.println("D");
          break;
        case 1:
          System.out.println("F");
          break;
      }
    }
  }
}
