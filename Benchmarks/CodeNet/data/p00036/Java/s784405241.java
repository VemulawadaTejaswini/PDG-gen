import java.util.Scanner;
import java.io.IOException;

class Main {
  private static final int SIZE = 8;
  private static char[][] array = new char[SIZE][SIZE];

  public static void main (String[] args) throws IOException {
    Scanner sc = new Scanner(System.in); 

    while(sc.hasNext()){
      for(int i=0; i<SIZE; i++){
        array[i] = sc.next().toCharArray();
      }

      System.out.println(determine());
    }
  }

  private static char determine(){
    int i = 0, j = 0;
    for(int k=0; k<SIZE*SIZE; k++){
      i = k / 8;
      j = k % 8;
      if(array[i][j] == '1') break;
    }

    if(i == SIZE - 1) return 'C';
    if(j == SIZE - 1) return 'D';

    if(array[i+1][j] == array[i][j] && array[i+2][j] == array[i][j]) return 'B';
    if(array[i][j+1] == array[i][j] && array[i][j+2] == array[i][j]) return 'C';

    if(array[i][j+1] == array[i][j] && array[i+1][j] == array[i][j]){
      if(array[i+1][j+1] == array[i][j]) return 'A';
      else return 'G';
    }

    if(array[i+1][j] == array[i][j] && array[i+1][j-1] == array[i][j]) return 'D';
    if(array[i][j+1] == array[i][j] && array[i+1][j+1] == array[i][j]) return 'E';
    if(array[i+1][j] == array[i][j] && array[i+1][j+1] == array[i][j]) return 'F';

    return '?';
  }
}