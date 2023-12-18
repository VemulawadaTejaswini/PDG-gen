import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[]a = new int[n];
for(int i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
for(int j=n-1;j>0;j--){
System.out.printf("%d ",a[j]);
}
System.out.printf("%d\n",a[0]);
sc.close();
}
}
