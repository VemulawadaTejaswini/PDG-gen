import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=scan.nextInt();
int[] a=new int[n];

int i=0;
int sum=0;
for(i=0;i<n;i++){
    a[i]=scan.nextInt();
    sum=sum+a[i];
}
  
int summ=0;
for(i=0;i<n;i++){
    if(4*m*a[i]>=sum){
        summ=summ+1;
    }
}

if(summ>=m){
System.out.println("Yes");
}else{
  System.out.println("No");
}

}
}