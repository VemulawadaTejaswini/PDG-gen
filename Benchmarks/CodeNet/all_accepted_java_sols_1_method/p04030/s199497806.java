import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
      switch(s.charAt(i)){
        case '1':
          sb.append('1');break;
        case '0':
          sb.append('0');break;
        case 'B':
          if(sb.length()>=1){
            sb.setLength(sb.length()-1);
          }
          break;
      }
    }
    System.out.print(sb.toString());
    System.out.flush();
  }
}
