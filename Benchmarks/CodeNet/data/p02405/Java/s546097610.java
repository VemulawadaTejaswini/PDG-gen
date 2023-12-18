import java.util.Scanner;class Main {
    public void yatary(){
        Scanner sc = new Scanner(System.in);
        int H = 0,W = 0;
        int x,y,a,b;
        H = sc.nextInt();
        W = sc.nextInt();
          while(H != 0 || W != 0){
              for(x = 1; x <= H;x++){ 
                  for(y = 1; y <= W;y++){
                      a = x % 2;
                      b = y % 2;
                      if(b == 1){
                      if(a == 1){
                          System.out.print("#");
                      }else{
                          System.out.print(".");
                      }
                      }else if(a == 0){
                          System.out.print("#"); 
                      }else{    
                          System.out.print(".");   
                      } 
                  }
        System.out.println();          
              }
        System.out.println();
        H = sc.nextInt();
        W = sc.nextInt();
        }
    }
    public static void main(String[] args) { 
        new Main().yatary();
    } 
}