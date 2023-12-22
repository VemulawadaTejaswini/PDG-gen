import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();

int i=1;
for(i=1;i<=2000;i++){
  if((i*8/100==a)&&(i*10/100==b)){
    break;
  }
}
  
  
if(i==2001){
System.out.println(-1);
}else{
  System.out.println(i);
}

}
}