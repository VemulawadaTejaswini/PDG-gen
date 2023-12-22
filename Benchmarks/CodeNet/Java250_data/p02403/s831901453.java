import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int H,W;

for(;;){
H = scan.nextInt();
W = scan.nextInt();
if(H == 0 && W == 0)break;
else {
  for(int i = 0 ; i < H ; i++){
      for(int j = 0 ; j < W ; j++){
         System.out.print("#");}
         System.out.println();}
    System.out.println();}}}}