import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int n=sc.nextInt();
int num=0;
for(int a=0;a<=9;a++){
for(int b=0;b<=9;b++){
for(int c=0;c<=9;c++){
if(binary_search(n-a-b-c)){
num++;
}
}
}
}
System.out.println(num);
}
}
public static boolean binary_search(int x){
int[] n=new int[10];
for(int a=0;a<=9;a++){
n[a]=a;
}
int l=0;
int r=10;
while(r-l>=1){
int i=l+r/2;
if(x==a[i]){
return true;
}
else if(x>a[i]){
l=i+1;
}
else if(x<a[i]){
r=i;
}
}
return false;
}
}