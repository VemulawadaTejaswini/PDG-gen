import java.util.*;
//解説参照、それを元に作成
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong(); 
    long B = sc.nextLong();
    for (int i=1;i<=B;i++){
      if ((A*i)%B==0){
        System.out.println(A*i);
        break;
      }
    }
  }
}