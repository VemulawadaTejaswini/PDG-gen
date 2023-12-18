import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] calculator = new String[3];
    int first_number = 0;
    int second_number = 0;
    String operator;
    List<String> answers = new ArrayList<String>();
    int answer = 0;

    while(true){
      calculator = br.readLine().split(" ");
      first_number = Integer.parseInt(calculator[0]);
      second_number = Integer.parseInt(calculator[2]);
      operator = calculator[1];

      if(operator.equals("+")){
        answer = first_number + second_number;
        answers.add(String.valueOf(answer));
      }else if(operator.equals("-")){
        answer = first_number - second_number;
        answers.add(String.valueOf(answer));
      }else if(operator.equals("*")){
        answer = first_number * second_number;
        answers.add(String.valueOf(answer));
      }else if(operator.equals("/")){
        answer = first_number / second_number;
        answers.add(String.valueOf(answer));
      }else if(operator.equals("%")){
        answer = first_number % second_number;
        answers.add(String.valueOf(answer));
      }else{
        break;
      }
    }

    for(String score:answers){
      System.out.println(score);
    }
  }
}

