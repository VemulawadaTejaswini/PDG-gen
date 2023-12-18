import java.util.*;

public class Main{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String[] input1=input.split(" ");
int[] in={0,0,0};
for(int i=0;i<input1.length;i++){
in[i] = Integer.parseInt(input1[i]);
}
int store;
while(in[0]<in[1] &&in[1]<in[2]){
if(in[0]>in[1]){
store=in[0];
in[0]=in[1];
in[1]=store;
}
if(in[1]>in[2]){
store=in[1];
in[1]=in[2];
in[2]=store;
}
}
System.out.println(in[0]+" "+in[1]+" "+in[2]);
}
}