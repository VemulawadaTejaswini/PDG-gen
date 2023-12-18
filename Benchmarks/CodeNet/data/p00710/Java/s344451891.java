import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        int p,n,r,c,i,j,k;
        int[] card = new int[51];
        int[] dummy = new int[51];
        Scanner s = new Scanner(System.in);
        while(true){
            n = s.nextInt();
            r = s.nextInt();
            if(n==0&&r==0)break;
            for(i=0;i<n;i++)card[i]=n-i;
            for(i=0;i<r;i++){
                p = s.nextInt();
                c = s.nextInt();
                for(j=0;j<p-1;j++)dummy[j]=card[j];
                for(j=0;j<c;j++)card[j]=card[j+p-1];
                for(j=0;j<p-1;j++)card[j+c]=dummy[j];
            }
            System.out.println(card[0]);
        }
    }
}

Compile Error Logs:

ステータス
Judge: 1/1	JAVA	CPU: 00:17 sec	Memory: 38220 KB	Length: 709 B	2018-04-23 13:55
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
Case #1	: Accepted	00:17	38220	17774	1052	judge_data

< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

