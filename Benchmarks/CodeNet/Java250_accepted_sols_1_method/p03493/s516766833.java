import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int[] a = new int[3];
    int count = 0;
    for(int i=0;i<3;i++){
      a[i] = Integer.valueOf(str.substring(i,i+1));
    }
    for(int j : a){
      if(j == 1) count++;
    }
    System.out.print(count);
  }
}