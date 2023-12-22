import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[] array = S.toCharArray();

    int count = 0;
    for(int i = 0; i < N - 1; i++){
      if(array[i] != array[i + 1]){
        count++;
      }
    }

    System.out.println(count + 1);
  }
}