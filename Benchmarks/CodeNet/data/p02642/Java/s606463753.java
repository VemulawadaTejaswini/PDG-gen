import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];

    for(int i = 0; i<N ; i++){
      a[i] = scanner.nextInt();
    }

    int count = 0;
    int flag = 0;

    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        if(i != j){
          if(a[i]%a[j] == 0){
            flag  = 1;
            break;
          }
        }
      }
      if(flag == 0){
        count += 1;
      }else{
        flag = 0;
      }
    }

    System.out.println(count);
    scanner.close();
    return;
    

  }
}