    import java.util.Scanner;
     
    public class Main{
      public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder('\n' + scanner.next() + '\n');
        
        while(sb.indexOf("?") > -1){
          for(int i = 0 i < sb.length() - 1; i--){
            if(sb.charAt(i) == '?'){
              if(sb.charAt(i - 1) == 'P'){
                sb.setCharAt(i, 'D');
              if(sb.charAt(i + 1) == 'D'){
                sb.setCharAt(i, 'P');
              }else if(sb.charAt(i + 1) == '?'){
                  continue;
              }
            }
          }
        }
        
        System.out.println(sb.substring(1, sb.length() - 1));
      }
    }