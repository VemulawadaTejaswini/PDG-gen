import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //赤
    int red = sc.nextInt();
    //緑
    int green = sc.nextInt();
    //青
    int blue = sc.nextInt();
    //操作回数
    int k = sc.nextInt();
    for(int i = 0; i < k;i++){
      if(blue <= red){
        blue = blue * 2;
      }else{
        if(green <= red){
          green = green * 2;
        }else{
          if(blue <= green){
            blue = blue * 2;
          }
        }
      }
      if(blue > green && green > red){
        break;
      }
    }
    
    if(blue > green && green > red){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}
