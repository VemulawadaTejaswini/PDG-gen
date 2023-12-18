import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int na=scan.nextInt();
int nb=scan.nextInt();
  
if(na%nb==0){
  System.out.println(na/nb);
}else{
  System.out.println((na/nb)+1);
}
  
}
}