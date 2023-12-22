import java.util.Scanner;
public class Main {
public static void main(String args[]) {
Scanner cro=new Scanner(System.in);
int a[][]=new int[3][3];
int i,j;
for(i=0;i<3;i++) for(j=0;j<3;j++) a[i][j]=cro.nextInt();
if(a[0][0]-a[0][1]==a[1][0]-a[1][1]&&a[0][0]-a[0][1]==a[2][0]-a[2][1]&&a[0][2]-a[0][1]==a[1][2]-a[1][1]&&a[0][2]-a[0][1]==a[2][2]-a[2][1]&&a[0][0]-a[1][0]==a[0][1]-a[1][1]&&a[0][0]-a[1][0]==a[0][2]-a[1][2]&&a[2][0]-a[1][0]==a[2][1]-a[1][1]&&a[2][0]-a[1][0]==a[2][2]-a[1][2])
    System.out.println("Yes");
else System.out.println("No");
}   
}