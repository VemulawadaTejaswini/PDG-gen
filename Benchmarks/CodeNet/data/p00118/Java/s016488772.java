import java.util.*;

public class Main{

Scanner sc=new Scanner(System.in);

int H=sc.nextInt();

int W=sc.nextInt();

String[][] k=new String[H][W];

for(int i=0;i<H;i++){

for(int j=0;j<W;j++){

k[i][j]=sc.next();

}

}

public static void main(String[] args){

int num=0;

for(int i=0;i<H;i++){

for(int j=0;j<W;j++){

if(k[i][j]!="."){

kukaku(k,i,j,H,W);

num++;

}

}

}

System.out.println(num);

}

public static void kukaku(int I,int J){

String p=k[I][J];

k[I][J]=".";

int[] dx={-1,0,0,1};

int[] dy={0,-1,1,0};

for(int i=0;i<4;i++){

if(p==k[I+dx[i]][J+dy[i]]&&I+dx[i]>=0&&I+dx[i]<H&&J+dy[i]>=0&&J+dy[i]<W){

kukaku(I+dx[i],J+dy[i]);

}

return;

}

}

}