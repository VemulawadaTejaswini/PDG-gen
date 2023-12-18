import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//System.out.println();
public class run{
   String op(int n){

      if(n%10==3){
         return "bon";
      }else if(n%10==0||n%10==1||n%10==6||n%10==8){
         return "pon";
      }else{
         return "hon";
      }
   }




   public static void main(String[] args) {
      // Use the Scanner class
      
      File file = new File("./input.txt");

      FileWriter writer = null;
      BufferedReader br = null;
      BufferedWriter bw = null;
      Scanner sc = null;
      run obj = new run();
      try{
            writer = new FileWriter("./output.txt");
            //br = Files.newBufferedReader(file.toPath());
            bw = new BufferedWriter(writer);
            sc = new Scanner(file);
            while(sc.hasNextLine()){
               int s = sc.nextInt();
               bw.write(obj.op(s));
               bw.newLine();
            }
            bw.close();
        }
        catch(IOException e){
            System.out.println("Wrong!");
        }


      
    
      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String
      */
      //String s   = sc.nextLine();       // read whole line as String
      //PrintStream ps = new PrintStream("/output.txt",s);
    }
    //System.out.println(s);
}