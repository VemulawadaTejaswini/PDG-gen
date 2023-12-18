import java.io.*;
import java.util.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String case_number;
    List<String> group_number = new ArrayList<String>();
    while(true){
      case_number = br.readLine();
      if(case_number.equals("0")){
        break;
      }
      group_number.add(case_number);
    }

    int case_count = 0;
    for(String number: group_number){
      case_count++;
      System.out.println("Case " + case_count + ": " + number);
    }
  }
}

