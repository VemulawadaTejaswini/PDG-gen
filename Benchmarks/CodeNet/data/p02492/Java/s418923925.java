import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
        String line = br.readLine();
        int a = Integer.parseInt(line.split(" ")[0]);
        String op = line.split(" ")[1];
        int b = Integer.parseInt(line.split(" ")[2]);

        String Plus = "+"; String Minus = "-";
        String Multiple = "*"; String Break = "/";
        String QUESTION = "?";
        if(op.equals(Plus)){
          System.out.println(a+b);
        }else if(op.equals(Minus)){
          System.out.println(a-b);
        }else if(op.equals(Multiple)){
          System.out.println(a*b);
        }else if(op.equals(Break)){
          System.out.println(a/b);
        }else{
          break;
        }
      }
    }
}