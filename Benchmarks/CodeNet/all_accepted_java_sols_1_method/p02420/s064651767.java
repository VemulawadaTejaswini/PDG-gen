import java.util.Scanner;
      
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      String strin = sc.next();
      if(strin.equals("-")){
        break;
      }
      String str[] = new String[strin.length()];
      for(int i = 0; i < strin.length(); i++){
        str[i] = "";
      }
   
      for(int x = 0; x < strin.length(); x++){
        for(int y = x; y < strin.length(); y++){
          char c = strin.charAt(y);
          str[x] += c;
        }
        for(int z = 0; z < x; z++){
          char c = strin.charAt(z);
          str[x] += c;
        }
      }
      
      int m = sc.nextInt();
      int t = 0;
      for(int x = 0; x < m; x++){
        int h = sc.nextInt();
        t += h;
      }
      System.out.println(str[t%strin.length()]);
    }
  }
}
