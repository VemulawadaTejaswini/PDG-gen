import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
boolean f=false;
for(int i=0;i<=n;i++){
    for(int j=0;j<=n-i;j++){
    if(10000*i+5000*j+1000*(n-j-i)==y){
    System.out.println(i+" "+j+" "+(n-i-j));
    f=true;
    break;
    }
    }
    if(f)break;
}
if(!f)System.out.println("-1 -1 -1");
}
}