import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int n=sc.nextInt();
int[] k=new int[w];
int p,q,r,s;
for(int i=0;i<w;i++){
k[i]=i+1;
}
for(int i=0;i<n;i++){
p=sc.nextInt();
q=sc.nextInt();
r=k[p-1];
s=k[q-1];
k[p-1]=s;
k[q-1]=r;
}
for(int i=0;i<w;i++){
System.out.println(k[i]);
}
}
}