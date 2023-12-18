import java.util.Scanner;
class Main{
public void yatary() {
    Scanner sc = new Scanner(System.in);
    int x,y,a,b;
    x = sc.nextInt();
    y = sc.nextInt();
    while(x == 0 || y == 0){
        for(a = 1; a <= x; a++){
        System.out.println("\n");
            for(b = 1; b <= y; b++){
            System.out.print("#");
            } 
        }
    x = sc.nextInt();
    y = sc.nextInt();    
    }
}
public static void main(String[]args){ 
   new Main().yatary();   
  }
}