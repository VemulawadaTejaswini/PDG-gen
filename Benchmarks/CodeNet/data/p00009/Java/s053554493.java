import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int count=0;
int n=sc.nextInt();
boolean[] prime=new boolean[n+1];
for(int i=2;i<=n;i++){
prime[i]=true;
}
for(int i=0;i<=n;i++){
if(prime[i]){
count++;
for(int j=i+i;j<n;j+=i){
prime[j]=false;
}
}
}
System.out.println(count);
}
}
}