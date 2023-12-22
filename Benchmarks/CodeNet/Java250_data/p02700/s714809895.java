import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
    int x = a/d+aa(a%d),y = c/b+aa(c%b);
    if(x>=y){
      pl("Yes");
    }else{
      pl("No");
    }
  }

  public static int aa(int n){
    if(n>0){return 1;}
    return 0;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
