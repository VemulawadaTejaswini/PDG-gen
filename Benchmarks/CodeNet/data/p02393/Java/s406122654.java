import java.util.Scanner;
class Main {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int a = in.nextInt();
  int b = in.nextInt();
  int c = in.nextInt();
  int tmp = 0;
  int[] ary = {a, b, c};
  while(ary[0] > ary[1] || ary[1] > ary[2]){
   if(ary[0] > ary[1]){
    tmp = ary[0];
    ary[0] = ary[1];
    ary[1] = tmp;
   }
   if(ary[1] > ary[2]){
    tmp = ary[1];
    ary[1] = ary[2];
    ary[2] = tmp;
   }
  }
  for(int i : ary) System.out.println(i);
 }
}