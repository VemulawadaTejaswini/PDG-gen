import java.io.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str_Numbers = br.readLine().split(" ");
    int first_Number = Integer.parseInt(str_Numbers[0]);
    int last_Number  = Integer.parseInt(str_Numbers[1]);
    int divisor      = Integer.parseInt(str_Numbers[2]);
    int counter      = 0;

    for(int i = first_Number; i <= last_Number; i++){
      if(divisor % i == 0){
        counter++;
      }
    }

    System.out.println(counter);
  }
}

