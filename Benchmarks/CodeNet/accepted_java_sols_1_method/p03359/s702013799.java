import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int count=0;
for(int i=1;i<=a-1;i++){
    for(int j=1;j<=31;j++){
    if(i==j){
        if(i==2&&j>=29){count+=0;
        }else if((i==4||i==6||i==9||i==11)&&(j==31)){
        count+=0;
        }else{
        count++;
        }
        
    }
    }
    }
if(a<=b)count++;
System.out.println(count);

}
}