import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String str = scan.next();
  
 String[] num=str.split("");
  
  int i=0;
  int sum=0;
  for(i=0;i<(num.length)/2;i++){
  if(num[i].equals(num[num.length-1-i])){
  sum=sum+1;
  }
  }
  System.out.println((num.length/2)-sum);
  
}
}