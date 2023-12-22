import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    char list[] = new char[200];
    char sub[] = new char[200];
    String L;
    int N,i,j,h;

    while(true){

      L = scanner.next();

      if(L.equals("-")){
        break;
      }

      for(i=0;i<L.length();i++){
        list[i] = L.charAt(i);
      }

      N = scanner.nextInt();

      for(i=0;i<N;i++){
        h = scanner.nextInt();

        for(j=0;j<L.length();j++){
          sub[j] = list[j];
        }

        for(j=h;j<L.length();j++){
          list[j-h] = sub[j];
        }

        for(j=0;j<h;j++){
          list[j+L.length()-h] = sub[j];
        }

      }

      for(i=0;i<L.length();i++){
        System.out.print(list[i]);
      }

      System.out.print("\n");
    }
  }
}

