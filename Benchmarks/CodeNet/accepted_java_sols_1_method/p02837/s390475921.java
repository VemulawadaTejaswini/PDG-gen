import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int numm=scan.nextInt();
int[] num=new int[numm];
int[][] que=new int[numm][numm];
int[][] ans=new int[numm][numm];

int i=0;
int j=0;
for(i=0;i<numm;i++){
    num[i]=scan.nextInt();
    for(j=0;j<num[i];j++){
        que[i][j]=scan.nextInt()-1;
        ans[i][j]=scan.nextInt();
    }
}

int[] tur=new int[15];
int[] a=new int[32768];
int[] l=new int[32768];
int[] sum=new int[32768];
int max=0;

goback:
for(int k=0;k<32768;k++){
    tur[0]=k%2;
    tur[1]=k/2%2;
    tur[2]=k/4%2;
    tur[3]=k/8%2;
    tur[4]=k/16%2;
    tur[5]=k/32%2;
    tur[6]=k/64%2;
    tur[7]=k/128%2;
    tur[8]=k/256%2;
    tur[9]=k/512%2;
    tur[10]=k/1024%2;
    tur[11]=k/2048%2;
    tur[12]=k/4096%2;
    tur[13]=k/8192%2;
    tur[14]=k/16384%2;

    for(a[k]=0;a[k]<numm;a[k]++){
        for(l[k]=0;l[k]<(num[a[k]]);l[k]++){
            if(tur[a[k]]==1&&!(tur[que[a[k]][l[k]]]==ans[a[k]][l[k]])){
            continue goback;
            }
        }
    }

    for(a[k]=0;a[k]<numm;a[k]++){
        if(tur[a[k]]==1){
            sum[k]=sum[k]+1;
        }
    }

    if(max<sum[k]){
        max=sum[k];
    }

}

System.out.println(max);

}
}