import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int[] a=new int[n];

int i=0;
for(i=0;i<n;i++){
    a[i]=scan.nextInt();
}

int sum=0;
for(i=0;i<n;i++){
    if(a[i]%2==1&&i%2==0){
        sum=sum+1;
    }
}

System.out.println(sum);


}
}