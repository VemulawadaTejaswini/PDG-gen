import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int[][] A=new int[101][101];
int[][] B=new int[101][101];
int[][] sum=new int[101][101];
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
for(int i=0;i<a;i++){
for(int j=0;j<c;j++){
sum[i][j]=0;
}
}
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
A[i][j]=scan.nextInt();
}
}
for(int i=0;i<b;i++){
for(int j=0;j<c;j++){
B[i][j]=scan.nextInt();
}
}
for(int l=0;l<a;l++){
for(int m=0;m<b;m++){
for(int n=0;n<c;n++){
sum[l][n]+=A[l][m]*B[m][n];
}
}
}

for(int i=0;i<a;i++){
for(int j=0;j<c;j++){
System.out.print(sum[i][j]);
if(c-1!=j)
System.out.print(" ");
else
System.out.println();
}

}

}
}