        import java.util.Scanner;
         
        public class Main {
          public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            int K = scan.nextInt();
            String S = scan.next();
            String Dot = ("...");
            if(S.length()>K){
              try {
                  String SuperS=S.substring(0, K);
                  String SSS = SuperS + Dot ;
                  System.out.println(SSS);
                
                } catch(NullPointerException e) {
                    System.out.println();
                } catch(Throwable e) {
                    System.out.println();
                }
            }else{
              System.out.println(S);
            }
          }
        }