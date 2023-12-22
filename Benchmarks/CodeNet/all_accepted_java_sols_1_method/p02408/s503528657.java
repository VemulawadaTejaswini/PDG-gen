import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int total = sc.nextInt();
int Sarr[] = new int [14];
int Harr[] = new int [14];
int Carr[] = new int [14];
int Darr[] = new int [14];

String str;
int input;

for(int i = 0; i< total ; i++){
try{
str = sc.next();
//System.out.println("str: "+str+"<--str");
//System.out.println("total: "+total+"<--total");

switch (str){
  case "S":
  input = sc.nextInt();
  Sarr[input] = 1;
  break;
//System.out.println("check S "+i);
  case "H":
  input = sc.nextInt();
  Harr[input] = 1;
  break;
  case "C":
  input = sc.nextInt();
  Carr[input] = 1;
  break;
  case "D":
  input = sc.nextInt();
  Darr[input] = 1;
  break;
  default:
  System.out.println("default");
  break;
}
}catch(InputMismatchException e){
  System.out.println("mismatch");
//  System.out.println("check i"+i);
  break;
}



}
//int cnt =0;
for(int i = 0;i<4; i++){
  for(int l = 1;l < 14; l++){
  switch (i){
    case 0:
    if( Sarr[l] != 1 ) System.out.println("S "+l);
    break;
    case 1:
    if( Harr[l] != 1 ) System.out.println("H "+l);
    break;
    case 2:
    if( Carr[l] != 1 ) System.out.println("C "+l);
    break;
    case 3:
    if( Darr[l] != 1 ) System.out.println("D "+l);
    break;
  }

  }

}//1

}//main

}//class
