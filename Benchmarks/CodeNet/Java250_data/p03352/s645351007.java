import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
double temp=0;
for(int i=1;i<32;i++){
for(int j=2;j<10;j++){
    if(Math.pow(i,j)<=x){
        
temp=Math.max(temp,Math.pow(i,j));
        }
        }
}
int ans=(int)temp;
System.out.println(ans);
}
}