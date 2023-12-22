import java.util.*;
public class Main{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int b=obj.nextInt();
int out=1;
int ans=0;

while(out<b){
out--;
out=out+a;
ans++;

}

System.out.println(ans);


}



}