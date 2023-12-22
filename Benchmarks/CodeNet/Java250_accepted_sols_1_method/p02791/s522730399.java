import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int[] p=new int[n];

int i=0;
for(i=0;i<n;i++){
    p[i]=scan.nextInt();
}
  
  int min=p[0];
    int sum=0;
    
  for(i=0;i<n;i++){
    if(min>=p[i]){
      min=p[i];
      sum=sum+1;
    }
  }
      

System.out.println(sum);
}
}