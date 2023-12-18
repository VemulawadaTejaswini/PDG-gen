import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][] t=new int[n][3];
for(int i=0;i<n;i++){
for(int j=0;j<3;j++){
t[i][j]=sc.nextInt();
}
if(triangle(i,t)){System.out.println("YES");}
else{System.out.println("NO");}
}
}
public static boolean triangle(int i,int[][] t){
double max=Math.max(Math.max(t[i][0],t[i][1]),t[i][2]);
double res=Math.min(Math.min(Math.hypot(t[i][0],t[i][1]),Math.hypot(t[i][0],t[i][2])),Math.hypot(t[i][2],t[i][1]));
if(res==max){return true;}
else{return false;}
}
}