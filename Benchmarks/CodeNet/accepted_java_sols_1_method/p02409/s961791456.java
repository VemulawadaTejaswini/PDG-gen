import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int[][][] c=new int[5][4][11];
for(int x=1;x<5;x++){
for(int y=1;y<4;y++){
for(int z=1;z<11;z++){
c[x][y][z]=0;
}
}
}
for(int b=0;b<a;b++){
int d=scan.nextInt();
int e=scan.nextInt();
int f=scan.nextInt();
int g=scan.nextInt();
c[d][e][f]=c[d][e][f]+g;
}
for(int x=1;x<5;x++){
for(int y=1;y<4;y++){
for(int z=1;z<11;z++){
System.out.print(" "+c[x][y][z]);
}
System.out.println();
}
if(x!=4)
System.out.println("####################");
}
}
}