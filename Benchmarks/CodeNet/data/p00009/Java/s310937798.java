import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int n=sc.nextInt();
int prime=0;
if(n>=2){
prime+=1;
if(n>2){
for(int i=3;i<=n;i++){
if(prime_number(i)){prime++;}
}
}
System.out.println(prime);
}
}
public static boolean prime_number(int x){
boolean f=true;
for(int i=2;i<n;i++){
if(x%i==0){
f=false;
break;
}
}
}
}