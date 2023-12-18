import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String str = br.readLine();
      StringBuilder transStr = new StringBuilder(str);
      StringBuilder order = new StringBuilder();
      StringBuilder revese = new StringBuilder();
      int q = Integer.parseInt(br.readLine());
      int[] sep = new int[]{0,0,0};
      int start = 0;
      int end   = 0;

      for ( int i = 0; i < q; i++ ) {

        order.append(br.readLine());
        sep[0] = order.indexOf(" ");
        sep[1] = order.indexOf(" ",sep[0]+1);

        switch(order.substring(0,sep[0])) {
          case "replace" :
            sep[2] = order.indexOf(" ",sep[1]+1);
            start = Integer.parseInt(order.substring(sep[0]+1,sep[1]));
            end   = Integer.parseInt(order.substring(sep[1]+1,sep[2]))+1;
            transStr.replace(start, end, order.substring(sep[2]+1));
            break;
          case "reverse" :
            start = Integer.parseInt(order.substring(sep[0]+1,sep[1]));
            end   = Integer.parseInt(order.substring(sep[1]+1))+1;
            revese.append(transStr.substring(start, end))
                  .reverse();
            transStr.replace(start, end, revese.toString());
            revese.setLength(0);
            break;
          case "print" :
            start = Integer.parseInt(order.substring(sep[0]+1,sep[1]));
            end   = Integer.parseInt(order.substring(sep[1]+1))+1;
            System.out.println(transStr.substring(start,end));
            break;
          default :
            break;
        }

        order.setLength(0);
      }
    }
  }
}
