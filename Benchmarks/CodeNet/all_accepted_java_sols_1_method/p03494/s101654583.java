import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    int[] input_number_list = new int[number];
    boolean is_even = true;
    int count = 0;

    for(int i = 0; i < number; i++){
      input_number_list[i] = scanner.nextInt();
    }

    while(is_even){
      for(int j = 0;j < input_number_list.length;j++){
        if(input_number_list[j] % 2 != 0){
          is_even = false;
          break;
        }
        input_number_list[j] = input_number_list[j]/2;
      } 
      if(is_even) count++;
    }
    System.out.println(count);
  }
}