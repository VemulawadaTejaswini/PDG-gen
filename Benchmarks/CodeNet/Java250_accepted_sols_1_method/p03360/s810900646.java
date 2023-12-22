import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A=Integer.parseInt(sc.next());
int B=Integer.parseInt(sc.next());
int C=Integer.parseInt(sc.next());
int K=Integer.parseInt(sc.next());
int temp1,temp2,temp3;
int ans=0;
temp1=A;
temp2=B;
temp3=C;
for(int i=0;i<K;i++){
if((temp1*2+temp2+temp3>=temp1+temp2*2+temp3)&&(temp1*2+temp2+temp3>=temp1+temp2+temp3*2)){
temp1*=2;
}else if((temp1+temp2*2+temp3>=temp1*2+temp2+temp3)&&(temp1+temp2*2+temp3>=temp1+temp2+temp3*2)){
temp2*=2;
}else if((temp1+temp2+temp3*2>=temp1*2+temp2+temp3)&&(temp1+temp2+temp3*2>=temp1+temp2*2+temp3)){
temp3*=2;
}
}
ans=temp1+temp2+temp3;
System.out.println(ans);
}
}