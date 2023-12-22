import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);

int h=scan.nextInt();
int n=scan.nextInt();
int[] a=new int[n];
 int i=0;
  for(i=0;i<n;i++){
    a[i]=scan.nextInt();
  }

int sum=0;
for(i=0;i<n;i++){
  sum=sum+a[i];
}
  
  if(sum<h){
  System.out.println("No");
  }else{
    System.out.println("Yes");
  }
}
}
