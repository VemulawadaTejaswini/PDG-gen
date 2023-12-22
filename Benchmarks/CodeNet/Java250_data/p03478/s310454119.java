import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    // xが最大値、各桁の和がa以上b以下のものの総和を求める
    int x = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();

    int ammount = 0;
    for(int i = 1; i <= x;i++){
      String s = String.valueOf(i);
      char[] c_array = s.toCharArray();
      int sum = 0;
      for(int j = 0; j < c_array.length;j++){
        sum += Integer.parseInt(String.valueOf(c_array[j]));
      }
      if(a <= sum && sum <= b ){
        ammount += i;
      }
    }
    System.out.println(ammount);
  }
}