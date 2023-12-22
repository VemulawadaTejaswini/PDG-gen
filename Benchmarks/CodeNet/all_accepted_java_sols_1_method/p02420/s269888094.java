import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,j=0,k=0,minj=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str;
    while(true){
    try{
      String line = reader.readLine();
      str = line;
      if (str == "-") {
        break;
      }
      line = reader.readLine();
      a = Integer.parseInt(line);
    }catch(Exception e){
      str = "";
      break;
    }


    for(j = 0;j < a; j++){
      try{
      String line2 = reader.readLine();
      c = Integer.parseInt(line2);
      }catch(Exception e){
        c = 0;
        break;
      }
      String str1 = str.substring(0,c);
      String str2 = str.substring(c);
      str = str2 + str1;

    }

    System.out.println(str);

  }
}
}
