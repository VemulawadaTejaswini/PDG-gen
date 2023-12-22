import java.util.*;
public class Main {
       public static void main(String[] args){
              int nui[] = new int[10];
              Scanner docaonui = new Scanner(System.in);
              for (int i = 0; i < 10; i++){
                  nui[i] = docaonui.nextInt();
              }
              Arrays.sort(nui);
              System.out.println(nui[9]);
              System.out.println(nui[8]);
              System.out.println(nui[7]);        
       }
}