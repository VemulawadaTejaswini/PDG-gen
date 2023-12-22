import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    boolean isBeauty = true;
    for(int i=0; i<S.length; i++){
      if(i%2 == 0 && S[i] == 'L'){
        isBeauty = false;
        break;
      }else if(i%2 !=0 && S[i] =='R'){
        isBeauty = false;
        break;
      }
    }
    if(isBeauty){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}