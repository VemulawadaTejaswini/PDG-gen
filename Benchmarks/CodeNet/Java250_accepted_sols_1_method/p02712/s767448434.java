import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[] =new int[a];
long e=0;
String c[] =new String[a];
for(int i=1;i<a+1;i++){
b[i-1]=i;
}
for(int i=1;i<a+1;i++){
    c[i-1]=String.valueOf(b[i-1]);
            if(b[i-1]%15==0){
        c[i-1]="FizzBuzz";
    }
    if(b[i-1]%3==0){
        c[i-1]="Fizz";
    }
        if(b[i-1]%5==0){
        c[i-1]="Buzz";
    }

}
for(int i=0;i<a;i++){
    if(c[i]=="FizzBuzz"||c[i]=="Fizz"||c[i]=="Buzz"){
    }else{
        e+=Integer.parseInt(c[i]);
    }
    }
    System.out.println(e);
}
}