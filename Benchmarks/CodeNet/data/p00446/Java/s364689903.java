import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
for(;;){
int n=Integer.parseInt(br.readLine());
if(n==0)break;
int taro[]=new int[2*n]; 
int hanako[]=new int[2*n];
for(int i=0;i<2*n;i++)hanako[i]=1;
for(int i=0;i<n;i++){
int m=Integer.parseInt(br.readLine())-1;
taro[m]=1;hanako[m]=0;
}
int tp=n,hp=n,max=-1; boolean f=true;
for(;;){
for(int i=0;i<2*n;i++){
	if(f==true)max=-1;
	if(max<i&&taro[i]==1){
     max=i; taro[i]=0;
     hp-=1; f=true;
     break;
     }}
if(hp==0)break;
for(int i=0;i<2*n;i++){
	if(f==false)max=-1;
	if(max<i&&hanako[i]==1){
     max=i; hanako[i]=0;
     tp-=1; f=false;
     break;
     }}
if(tp==0)break;
}
System.out.println(tp);
System.out.println(hp);
}
}
}