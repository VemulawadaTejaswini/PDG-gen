import java.util.Scanner;
 
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextLong()){
long n=sc.nextLong();
int prime=0;
if(n>=2){
prime+=1;
if(n>2){
for(long i=3;i<=n;i++){
if(prime_number(i)){
prime++;
}
}
}
}
System.out.println(prime);
}
}
public static boolean prime_number(long x){
boolean f=true;
for(long i=2;i<x;i++){
if(x%i==0){
f=false;
break;
}
}
return f;
}
}