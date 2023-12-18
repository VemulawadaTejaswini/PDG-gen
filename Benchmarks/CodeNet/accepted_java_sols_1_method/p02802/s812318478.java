import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=scan.nextInt();
int[] p=new int[m];
String[] s=new String[m];

int i=0;
for(i=0;i<m;i++){
    p[i]=scan.nextInt();
    s[i]=scan.next();
}
  
int[] a=new int[n];
int[] b=new int[n];
for(i=0;i<n;i++){
    a[i]=0;
    b[i]=0;
}
  
for(i=0;i<m;i++){
    if(s[i].equals("WA")&&b[p[i]-1]==0){
        a[p[i]-1]=a[p[i]-1]+1;
    }
    if(s[i].equals("AC")&&b[p[i]-1]==0){
        b[p[i]-1]=b[p[i]-1]+1;
    }
}

int sum=0;
int summ=0;
for(i=0;i<n;i++){
  if(b[i]==1){
  sum=sum+a[i];
  }
  summ=summ+b[i];
}

System.out.println(summ+" "+sum);
}
}