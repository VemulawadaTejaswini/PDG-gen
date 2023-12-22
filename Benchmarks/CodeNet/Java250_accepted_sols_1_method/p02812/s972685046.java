import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int n = sc.nextInt();
    char[] letters = sc.next().toCharArray();
    for(int i = 0; i < n - 2; i++){
    if(letters[i] == 'A'){
      if(letters[i+1] == 'B'){
        if(letters[i+2] == 'C'){
          a++;
        }
        continue;
      }
      else{
        continue;
      }
    }else{
      continue;
    }
  }
  System.out.println(a);
    
  }
}