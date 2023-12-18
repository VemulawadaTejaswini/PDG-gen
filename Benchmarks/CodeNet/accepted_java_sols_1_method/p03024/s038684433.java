import java.util.*;

class Main{
  public static void main(String[] args){
    int numx=0;
  //  int numx=0;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    //String[] strArray = str.split("");
  for(int i=0; i < str.length(); i++){
    if(str.charAt(i)=='x'){
      numx++;
    }
  }
  if(numx >= 8){
    System.out.println("NO");
  }else{
    System.out.println("YES");
    }
  }
}
