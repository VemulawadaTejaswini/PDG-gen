import java.util.Scanner;
public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String str = sc.next();
  int i = 0;
  if(str.equals("SUN")){
    i = 7;
  }else if(str.equals("MON")){
    i=6;}
    else if(str.equals("TUE")){
      i=5;}
      else if(str.equals("WED")){
        i=4;}
  else if(str.equals("THU")){
    i=3;}
  else if(str.equals("FRI")){
    i=2;}
  else{
    i=1;}
  System.out.print(i);
  }
  }
