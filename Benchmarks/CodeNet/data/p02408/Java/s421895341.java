import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int n=Integer.parseInt(str);
int[] Scard={0,0,0,0,0,0,0,0,0,0,0,0,0};
int[] Hcard={0,0,0,0,0,0,0,0,0,0,0,0,0};
int[] Ccard={0,0,0,0,0,0,0,0,0,0,0,0,0};
int[] Dcard={0,0,0,0,0,0,0,0,0,0,0,0,0};
for(int i=0; i<n; i++){
String str2=br.readLine();
String[] card=str2.split(" ");
numCheck(card[1],card[0]);
}
cardPrint(Scard,"S");
cardPrint(Hcard,"H");
cardPrint(Ccard,"C");
cardPrint(Dcard,"D");
System.out.println();
br.close();
}
static void numCheck(String num,String mark){
int c=Integer.parseInt(num);
switch(mark){
case "S": Scard[c-1]=1;
          break;
case "H": Hcard[c-1]=1;
          break;
case "C": Ccard[c-1]=1;
          break;
case "D": Dcard[c-1]=1;
          break;
default:  break;
}
}
static void cardPrint(int[] tramp, String suit){
for(int j=0; j<13; j++){
if(tramp[j]==0)  System.out.println(suit+" "+j+1);
}
}
} 