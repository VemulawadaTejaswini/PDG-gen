import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
String[] a=new String[n];

int i=0;
for(i=0;i<n;i++){
    a[i]=scan.next();
}
Arrays.sort(a);  
  
int[] b=new int[n];
for(i=0;i<n;i++){
    b[i]=1;
}
  
for(i=1;i<n;i++){
  if(a[i].equals(a[i-1])){
    b[i]=b[i-1]+1;
  }
}
  
int max=0;  
for(i=0;i<n;i++){
  if(b[i]>max){
    max=b[i];
  }
}
  
for(i=0;i<n;i++){
  if(b[i]==max){
    System.out.println(a[i]);
  }
}
  
}
}