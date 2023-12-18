import java.util.Scanner;

public class Main5{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      while(true){
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n==0 && r==0) break;


        int[] card = new int[n];
        for(int i=0;i<n;i++){
          card[i]=n-i;
        }


        for(int i=0;i<r;i++){

          int p = sc.nextInt();
          int c = sc.nextInt();

          int[] new_card = new int[p-1];
          for(int j=0;j<p-1;j++){
            new_card[j] = card[j];
          }
          for(int j=0;j<c;j++){
            card[j] = card[p-1+j];
          }
          for(int j=0;j<p-1;j++){
            card[c+j] = new_card[j];
          }
        }
        System.out.println(card[0]);
      }
    }
  }
}

