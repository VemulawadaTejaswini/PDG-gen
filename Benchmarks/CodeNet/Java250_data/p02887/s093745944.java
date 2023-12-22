import java.util.Scanner;
class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] in = new int[n];
  String input = sc.next();
  int cnt = 0;
  for(int i = 0; i < n; i++){
    in[i] = input.charAt(i);
    if(i == 0){
      cnt++;
    }else{
      if(in[i] != in[i - 1]){
        cnt++;
      }
    }
  }
  System.out.println(cnt);
}
}