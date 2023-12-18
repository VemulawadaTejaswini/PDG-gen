import java.util.*;
import java.io.*;

class Main{
  static int n;

  public static void main(String[] args) throws IOException{
      int i,j=0;
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      n = Integer.parseInt(buffer.readLine());
      Set<String> d = new HashSet<String>();
      String[] str;

      for(i=0;i<n;i++) {
          str = buffer.readLine().split(" ");
          if(str[0].equals("insert")){
            d.add(str[1]);
          }
          else{
            if(d.contains(str[1])){
              System.out.println("yes");
            }
            else{
              System.out.println("no");
            }
          }
        }
          }
        }

