import java.util.Scanner;
  2 class C7{
  3     public static void main(String[] args){
  4         Scanner in = new Scanner(System.in);
  5             int r = in.nextInt();
  6             int c = in.nextInt();
  7             for(int i=0; i<r; i++){
  8                 int g = 0;
  9                 for(int j = 0; j<c+1; j++){
 10                     if(c-1 == j){                                                                
 11                         System.out.print(g);
 12                     }else{
 13                     int h = in.nextInt();
 14                     System.out.print(h + " ");
 15                     g += h;
 16                     }
 17                 }
 18             }
 19     }
 20 }