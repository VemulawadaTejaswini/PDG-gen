import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int building,floor,room,v;
    int a[][][] = new int[4][3][10];

    for(int x = 0; x < 4; x++){
      for(int y = 0; y < 3; y++){
        for(int z = 0; z < 10; z++){
          a[x][y][z] = 0;
        }
      }
    }

    for(int x = 0; x < number; x++){
      building = sc.nextInt();
      floor = sc.nextInt();
      room = sc.nextInt();
      v = sc.nextInt();
      a[building-1][floor-1][room-1] = a[building-1][floor-1][room-1]+v;
    }

    for(int x = 0; x < 4; x++){
      for(int y = 0; y < 3; y++){
        for(int z = 0; z < 10; z++){
          System.out.print(" "+a[x][y][z]);
        }
        System.out.println("");
      }
      if(x < 3){
        System.out.println("####################");
      }
    }
  }
}
