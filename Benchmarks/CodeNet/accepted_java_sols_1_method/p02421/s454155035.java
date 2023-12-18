import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int Tpoint = 0;
    int Hpoint = 0;
    int T[] = new int[100];
    int H[] = new int[100];
    
 
    for(int i = 0; i < n; i++){
      for(int x = 0; x < 100; x++){
        T[x] = 0;
        H[x] = 0;
      }
      String strT = sc.next();
      int Tnum = strT.length();
      for(int x = 0; x < Tnum; x++){
        char c = strT.charAt(x);
        T[x] += Character.getNumericValue(c);
      }
      String strH = sc.next();
      int Hnum = strH.length();
      for(int x = 0; x < Hnum; x++){
        char c = strH.charAt(x);
        H[x] += Character.getNumericValue(c);
      }
      
      for(int x = 0; x < 100; x++){
        if(T[x] > H[x]){
          Tpoint += 3;
          break;
        }else if(T[x] < H[x]){
          Hpoint += 3;
          break;
        }else if(T[x] == 0 && H[x] == 0){
          Tpoint += 1;
          Hpoint += 1;
          break;
        }
      }
    }
    System.out.println(Tpoint+" "+Hpoint);
  }
}
