import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
int s=Integer.parseInt(sc.next());
int max=0,temp1=0,temp2=0;
for(int i=0;i<s;i++){
    for(int j=0;j<s;j++){
        for(int t=s;0<=t;s--){
         if(j*(100+x)/100==i&&t*(100+x)/100==s-i){ 
      temp1=j;
      temp2=t;
        break;
    }}
    temp1=temp1*(100+y)/100;
    temp2=temp2*(100+y)/100;
    break;
    }
max=Math.max(temp1+temp2,max);}
System.out.println(max);
}
}
