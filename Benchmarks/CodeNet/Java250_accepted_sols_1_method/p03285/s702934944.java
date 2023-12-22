import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int ans=0;
for(int i=0;i<=25;i++){
    for(int j=0;j<=14;j++){
    if(4*i+7*j==n){ans=1;break;}
    }
    if(ans==1)break;
}
if(ans==1){
System.out.println("Yes");
}
else{System.out.println("No");}
}}
