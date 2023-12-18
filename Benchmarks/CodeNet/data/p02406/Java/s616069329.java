import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    int x=i;
    if(%3==0){
    System.out.print(" "+i);
    }else if(i%10==3){
    System.out.print(" "+i);
    }else if(x!=0){
        while(x!=0){
        x/=10;
        if(x%10==3)System.out.print(" "+i);
        }
    }
}System.out.println("");


}
}
