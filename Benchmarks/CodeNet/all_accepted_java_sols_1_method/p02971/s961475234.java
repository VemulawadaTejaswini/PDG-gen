import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f = 0;
    int s = 0;
    int index = 0;
    int cur;
    for(int i = 0 ; i < n ; i++){
      cur = Integer.parseInt(sc.next());
      if(cur >= f){
        s = f;
        f = cur;
        index = i;
      }else if(cur > s){
        s = cur;
      }
    }
    for(int i = 0; i < n; i++){
      if(i != index){
        System.out.println(f);
      }else{
        System.out.println(s);
      }
    }
  }
}


