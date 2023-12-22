import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
boolean v[][]=new boolean[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
int t =sc.nextInt();
while(t-->0)
{
int n =sc.nextInt();
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(a[i][j]==n)
v[i][j]=true;
}
} 
}
if((v[0][0] && v[0][1] && v[0][2]) || (v[1][0] && v[1][1] && v[1][2]) || (v[2][0] && v[2][1] && v[2][2]) || (v[0][0] && v[1][0] && v[2][0]) || (v[0][1] && v[1][1] && v[2][1]) || (v[0][2] && v[1][2] && v[2][2]) || (v[0][0] && v[1][1] && v[2][2]) || (v[0][2] && v[1][1] && v[2][0]))
System.out.println("Yes");
else
System.out.println("No");
}

}