import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();

int mon=num/100;
int monn=num%100;
if(monn<=5*mon){
System.out.println(1);
}else{
System.out.println(0);
}
  
  
  
}
}