import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int nn=scan.nextInt();
int kk=scan.nextInt();
  
int na=Math.max(nn,kk);
int nb=Math.min(nn,kk);

int sum=0;
int i=0;
for(i=0;i<na;i++){
  sum=sum+nb*(int)Math.pow(10,i);
}
  
System.out.println(sum);
}
}
