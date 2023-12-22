import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
int temp=0;
long suma;
byte N=sc1.nextByte();
byte M=sc1.nextByte();
byte C=sc1.nextByte();
byte arr[]=new byte[M];
for(byte i=0;i<M;i++){arr[i]=sc1.nextByte();}
byte matriz[][]=new byte[N][M];
for(byte i=0;i<N;i++){
for(byte j=0;j<M;j++){matriz[i][j]=sc1.nextByte();}
}
for(byte i=0;i<N;i++){suma=C;
for(byte j=0;j<M;j++){suma+=(matriz[i][j]*arr[j]);}
if(suma>0){temp++;}
}
        System.out.println(temp);
    }
}