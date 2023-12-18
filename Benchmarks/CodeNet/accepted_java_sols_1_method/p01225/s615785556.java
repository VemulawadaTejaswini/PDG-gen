import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
 
 
        int i,j,t;
        String st;
    
        t = s.nextInt();
        for(i=0;i<t;i++){
            int[] num = new int[10];
            int[] g = new int[10],b =new int[10], r =new int[10];
            boolean ch=true;
            for(j=0;j<9;j++)num[j]=s.nextInt();
            for(j=0;j<9;j++){
 
                st = s.next();
                if(st.charAt(0)=='G')g[num[j]]++;
                else if(st.charAt(0)=='B')b[num[j]]++;
                else if(st.charAt(0)=='R')r[num[j]]++;
            }
            for(j=1;j<=9;j++){
                if(g[j]>=3)g[j]-=3;
                if(j<8&&g[j]==2&&g[j+1]>1&&g[j+2]>1){
                    g[j]-=2;
                    g[j+1]-=2;
                    g[j+2]-=2;
                }
                if(j<8&&g[j]==1&&g[j+1]>0&&g[j+2]>0){
                    g[j]--;
                    g[j+1]--;
                    g[j+2]--;
                }
                if(b[j]>=3)b[j]-=3;
                if(j<8&&b[j]==2&&b[j+1]>1&&b[j+2]>1){
                    b[j]-=2;
                    b[j+1]-=2;
                    b[j+2]-=2;
                }
                if(j<8&&b[j]==1&&b[j+1]>0&&b[j+2]>0){
                    b[j]--;
                    b[j+1]--;
                    b[j+2]--;
                }
                if(r[j]>=3)r[j]-=3;
                if(j<8&&g[j]==2&&r[j+1]>1&&r[j+2]>1){
                    r[j]-=2;
                    r[j+1]-=2;
                    r[j+2]-=2;
                }
                if(j<8&&r[j]==1&&r[j+1]>0&&r[j+2]>0){
                    r[j]--;
                    r[j+1]--;
                    r[j+2]--;
                }
                if(g[j]>0||b[j]>0||r[j]>0){
                    ch = false;
                    break;
                }   
            }
            if(ch==true)System.out.println(1);
            else System.out.println(0);
            for(j=0;j<=9;j++){
                g[j]=0;
                b[j]=0;
                r[j]=0;
                num[j]=0;
            }
            ch=true;
        }
 
    }
}

