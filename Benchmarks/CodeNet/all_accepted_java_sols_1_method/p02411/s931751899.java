import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a[][]=new int[50][3];
String b[]=new String[50];
int j=0;
a[0][0]=0;a[0][1]=0;a[0][2]=0;
for(int i=0;a[i][0]!=-1||a[i][1]!=-1||a[i][2]!=-1;i++) {
	a[i+1][0]=scan.nextInt();
	a[i+1][1]=scan.nextInt();
	a[i+1][2]=scan.nextInt();
j++;
if(a[i+1][0]==-1||a[i+1][1]==-1) {b[i]="F";}
else if(a[i+1][0]+a[i+1][1]>=80) {b[i]="A";}
else if(a[i+1][0]+a[i+1][1]<80&&a[i+1][0]+a[i+1][1]>=65) {b[i]="B";}
else if(a[i+1][0]+a[i+1][1]<65&&a[i+1][0]+a[i+1][1]>=50) {b[i]="C";}
else if(a[i+1][0]+a[i+1][1]<50&&a[i+1][0]+a[i+1][1]>=30) {
if(a[i+1][2]>=50) {b[i]="C";}else {b[i]="D";}}
else {b[i]="F";}
}
for(int i=0;i!=j-1;i++) {
	System.out.println(b[i]);
}
}
}

