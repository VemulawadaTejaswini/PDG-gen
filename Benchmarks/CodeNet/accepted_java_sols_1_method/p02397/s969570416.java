import java.io.*;
import java.util.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] case_numbers;
    int small_number = 0;
    int large_number = 0;
    List<String> group_number = new ArrayList<String>();
    while(true){
      case_numbers = br.readLine().split(" ");
      small_number = Integer.parseInt(case_numbers[0]);
      large_number = Integer.parseInt(case_numbers[1]);
      if(small_number == 0 && large_number == 0){
        break;
      }
      if(small_number > large_number){
        int tmp = small_number;
        small_number = large_number;
        large_number = tmp;
      }
      group_number.add(small_number + " " + large_number);
    }

    for(String number: group_number){
      System.out.println(number);
    }
  }
}

