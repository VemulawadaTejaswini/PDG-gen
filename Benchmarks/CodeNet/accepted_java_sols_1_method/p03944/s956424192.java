import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
      String[] t=sc.nextLine().split(" ");
 
//    String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();

//int n=Integer.parseInt(nyu);

int W=Integer.parseInt(t[0]);
int H=Integer.parseInt(t[1]);
int N=Integer.parseInt(t[2]);

boolean[][] data=new boolean[H][W];

for(int i=0;i<N;i++){
t=sc.nextLine().split(" ");
int W2=Integer.parseInt(t[0]);
int H2=Integer.parseInt(t[1]);
int N2=Integer.parseInt(t[2]);
switch(t[2]){
case "1":
for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
if(k+1<=W2)data[j][k]=true;
}}
break;
case "2":
for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
if(k+1>W2)data[j][k]=true;
}}

break;
case "3":
for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
if(j+1<=H2)data[j][k]=true;
}}

break;
case "4":
for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
if(j+1>H2)data[j][k]=true;
}}

break;


}//swi

for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
//System.out.print(data[j][k]+" ");
}
//System.out.println();

}
//System.out.println();


}//for

//Queue<String> qA = new ArrayDeque<>();
int count=0;
for(int j=0;j<H;j++){
for(int k=0;k<W;k++){
//System.out.print(data[j][k]+" ");
if(data[j][k]==false)count++;
}
//System.out.println();

}


System.out.println(count);
	}
}