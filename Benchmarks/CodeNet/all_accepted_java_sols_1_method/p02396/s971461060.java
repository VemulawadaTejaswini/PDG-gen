import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int i = 0,j;
    int num[] = new int[100000];
    while(true){
      num[i] = stdIn.nextInt();
      if(num[i] == 0){
        break;
      }
      i++;
    }


    for(j = 0;j < i;j++){
      System.out.println("Case " + (j + 1) + ": " + num[j]);
    }
  }
}