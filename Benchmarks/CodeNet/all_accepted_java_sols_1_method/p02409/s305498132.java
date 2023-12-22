import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[][][] vv=new int[4][3][10];
for(int i=0;i<N;i++){
int b=Integer.parseInt(sc.next());
int f=Integer.parseInt(sc.next());
int r=Integer.parseInt(sc.next());
int v=Integer.parseInt(sc.next());
vv[b-1][f-1][r-1]+=v;
}

for(int F=0;F<4;F++){
for(int j=0;j<3;j++){
    for(int i=0;i<10;i++){
    if(i!=9){System.out.print(" "+vv[F][j][i]);}else{System.out.println(" "+vv[F][j][i]);}
    }
if(F!=3&&j==2)System.out.println("####################");
}
}

}
}
