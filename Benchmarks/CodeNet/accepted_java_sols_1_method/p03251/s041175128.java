import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int X = scan.nextInt();
    int Y = scan.nextInt();
    
    int max_x =scan.nextInt();
    for(int i=1;i<n;i++){
      int tmp = scan.nextInt();
      if(tmp>max_x){max_x=tmp;}
    }
    
    int min_y =scan.nextInt();
    for(int i=1;i<m;i++){
      int tmp = scan.nextInt();
      if(tmp<min_y){min_y=tmp;}
    }
    scan.close();
    
    if(max_x<min_y&&max_x>=X&&min_y<=Y){
      System.out.println("No War");
    }else{
      System.out.println("War");
    }
    
    return;
  }
}