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

Arrays.sort(a);
int sum=0;
for(i=0;i<n-1;i++){
    if(a[i]==a[i+1]){
        sum=sum+1;
    }
}

if(sum==0){
    System.out.println("YES");
}else{
    System.out.println("NO");
}

}
}