import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int hi=scan.nextInt();
int wo=scan.nextInt();
int na=scan.nextInt();
  
int nb=na/Math.max(hi, wo);
if(na%Math.max(hi, wo)==0){
    System.out.println(nb);
}else{
    System.out.println(nb+1);
}
  
}
}
