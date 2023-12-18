/* ITP1_9_D */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      int q = Integer.parseInt(br.readLine());

      for(int i = 0; i < q; i++){
        String[] order = br.readLine().split(" ");
        int a = Integer.parseInt(order[1]);
        int b = Integer.parseInt(order[2]);
        StringBuilder sb = new StringBuilder();
        String sub = str.substring(a, b+1);

        switch(order[0]){
          case "print":
            sb.append(str.substring(a,b+1));
            System.out.println(sb);
            break;
          case "reverse":
            sb.append(sub);
            sb.reverse();
            sb.insert(0, str.substring(0, a));
            sb.insert(b+1, str.substring(b+1, str.length()));
            str = sb.toString();
            break;
          case "replace":
            sb.append(str.substring(0, a));
            sb.append(order[3]);
            sb.append(str.substring(b+1, str.length()));
            str = sb.toString();
            break;
          default:
            break;
        }
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}