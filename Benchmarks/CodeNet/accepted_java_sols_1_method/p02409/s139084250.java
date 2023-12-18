import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int House[][][] = new int[4][3][10];
    int N = scanner.nextInt();
    int x,y,z,p;

    for(int i=0;i<N;i++){
      x = scanner.nextInt();
      y = scanner.nextInt();
      z = scanner.nextInt();
      p = scanner.nextInt();
      House[x-1][y-1][z-1] += p;
    }

    for(x=0;x<4;x++){
      for(y=0;y<3;y++){
        for(z=0;z<10;z++){
          System.out.print(" " + House[x][y][z]);
        }
        System.out.print("\n");
      }
      if(x!=3){
        System.out.println("####################");
      }
    }
  
  }
}

