import java.io.*;class Main{
public static void main(String[]_)throws Exception{
int i,j,k;
float l[]=new float[8];
BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
for(String s;(s=B.readLine())!=null;System.out.println(k>0?"NO":"YES")){
_=s.split(",");
for(k=j=0;j<2;j++){
for(i=0;i<8;i++)l[i]=Float.valueOf(_[(4*j+i)%8]);
if(
((l[0]-l[2])*(l[5]-l[1])+(l[1]-l[3])*(l[0]-l[4]))*
((l[0]-l[2])*(l[7]-l[1])+(l[1]-l[3])*(l[0]-l[6]))<0)k++;
}
}
}
}