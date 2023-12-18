import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num [] = new int[3];

    for(int i=0; i<3; i++) num[i] = sc.nextInt();

    for(int i=0; i<2; i++){
      for(int j=0; j<2; j++){
        if(num[j]>num[j+1]){
          int change = 0;
          change = num[j];
          num[j] = num[j+1];
          num[j+1] = change;
        }
      }
    }
    System.out.printf("%d %d %d\n", num[0], num[1], num[2]);
  }
}

