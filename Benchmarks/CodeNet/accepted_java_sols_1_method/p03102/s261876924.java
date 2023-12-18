import java.util.Scanner;
class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int c=sc.nextInt();
int b[] = new int[m];
for(int i=0; i<m; i++){
b[i]=sc.nextInt();
}
int a[][]=new int[n][m];
for(int i=0; i<n; i++){
for(int j=0; j<m; j++){
a[i][j]=sc.nextInt();
}}
int sum =0;
int total=0;
for(int i=0; i<n; i++){
for(int j=0; j<m; j++){
sum=sum+a[i][j]*b[j];
}
if (sum+c>0)
total++;
sum=0;
}
System.out.println(total);
}}
