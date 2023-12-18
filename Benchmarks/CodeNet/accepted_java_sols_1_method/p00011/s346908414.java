import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int n=sc.nextInt();
int[] k=new int[w];
for(int i=0;i<w;i++){
k[i]=i+1;
}
for(int j=0;j<n;j++){
String[] line=sc.next().split(",");
int p=Integer.parseInt(line[0]);
int q=Integer.parseInt(line[1]);
int r=k[p-1];
k[p-1]=k[q-1];
k[q-1]=r;
}
for(int l=0;l<w;l++){
System.out.println(k[l]);
}
}
}