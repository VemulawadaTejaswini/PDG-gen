// ITP1_7_A
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // Configuration
    Scanner scanner = new Scanner(System.in);

    // Initialization
    int m = 0;
    int f = 0;
    int r = 0;

    // score calc
    while(true){
      String[] row = scanner.nextLine().split(" ");
      m = Integer.parseInt(row[0]);
      f = Integer.parseInt(row[1]);
      r = Integer.parseInt(row[2]);

      // stop condition
      if(m==-1 && f==-1 && r==-1){
        break;
      }

      // F rank
      if(m==-1 || f==-1){
        System.out.println("F");
        continue;
      }

      if(m+f>=80){ // A rank
        System.out.println("A");
      }else if(m+f>=65 && m+f<80){ // B rank
        System.out.println("B");
      }else if(m+f>=50 && m+f<65){ // C rank
        System.out.println("C");
      }else if(m+f>=30 && m+f<50){ // D rank
        if(r>=50){
          System.out.println("C");
        }else{
          System.out.println("D");
        }
      }else{
        System.out.println("F");
      }
    }
  }
}

