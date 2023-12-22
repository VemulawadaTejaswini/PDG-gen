import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int  i = sc.nextInt();

int n = i/100*111;
if(n>=i){
  System.out.println(n);
}else{
  System.out.println(n+111);
}



}
}
