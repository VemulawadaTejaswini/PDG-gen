import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
      String[] t=sc.nextLine().split(" ");
 
//    String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();

//int n=Integer.parseInt(nyu);

int H=Integer.parseInt(t[0]);
int W=Integer.parseInt(t[1]);
//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);

//boolean[][] data=new boolean[H][W];

String[][] list=new String[H][W];
String[][] listnew=new String[H*2][W*2];

for(int i=0;i<H;i++){
String[] temp=sc.nextLine().split("");
for(int j=0;j<W;j++){

list[i][j]=temp[j];
}
}
/*
for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
System.out.print(list[i][j]);
}
System.out.println();
}
System.out.println();

*/



for(int i=0;i<2*H;i++){
for(int j=0;j<W;j++){

listnew[i][j]=list[i/2][j];
}
System.out.println();
}


for(int i=0;i<2*H;i++){
for(int j=0;j<W;j++){
System.out.print(listnew[i][j]);
}
System.out.println();
}

	}
}