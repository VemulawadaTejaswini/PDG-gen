import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] x = new int[5];
    int index = 0;
    for(int i=0; i<5; i++){
      x[i] = sc.nextInt();
      if(x[i] == 0){
        index = i+1;
      }
    }
    System.out.println(index);

    sc.close();
  }
}
