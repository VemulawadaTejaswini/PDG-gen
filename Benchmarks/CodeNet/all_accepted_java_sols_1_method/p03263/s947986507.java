import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
//処理
int H=sc.nextInt();
int W=sc.nextInt();
int[][] a=new int[H][W];
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        a[i][j]=sc.nextInt();
    }
}
String[] s=new String[W*H*2];
int c=0;
for (int i = 0; i < H; i++) {
    if(i%2==0){
        for (int j = 0; j < W; j++) {
            if(a[i][j]%2==1){
                a[i][j]--;
                if(j!=W-1){
                    s[++c]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+1)+" "+String.valueOf(j+2);
                    a[i][j+1]++;
                }else if(i!=H-1){
                    s[++c]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+2)+" "+String.valueOf(j+1);
                    a[i+1][j]++;
                }
            }
        }
    }else{
        for (int j = W-1; j >=0 ; j--) {
            if(a[i][j]%2==1){
                a[i][j]--;
                if(j!=0){
                    s[++c]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+1)+" "+String.valueOf(j);
                    a[i][j-1]++;
                }else if(i!=H-1){
                    s[++c]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+2)+" "+String.valueOf(j+1);
                    a[i+1][j]++;
                }
            }
        }
    }
}
s[0]=String.valueOf(c);
for (int j = 0; j <= c; j++) {
    out.println(s[j]);
}
}
}