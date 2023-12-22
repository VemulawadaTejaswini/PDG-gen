import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 int N = scan.nextInt();
 int FB[] = new int[N];
 long sum = 0;
  //配列にNまで代入
  for (int i = 0; i < N; i++){
    FB[i] = i + 1;
  }
  //文字へ置換
  for (int i = 0; i < N  ; i++){
   if (FB[i] % 3 == 0 || FB[i] % 5 == 0){
     FB[i] = 0;
   }
    sum = sum + FB[i];
   }
  System.out.println(sum);
 }
}