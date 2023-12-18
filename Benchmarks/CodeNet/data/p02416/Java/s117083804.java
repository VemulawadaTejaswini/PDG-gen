import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
 int ans=0;
    int r=Integer.parseInt(sc.next());
   if(r==0)break;
 while(r!=0){
 ans+=r%10;
 r/=10;
 }
 System.out.println(ans);
}
}
}
