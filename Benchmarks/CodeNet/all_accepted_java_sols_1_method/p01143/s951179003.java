import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
int l=0;
        while(line!="0 0 0"){

            String[]s=line.split(" ",0);
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int p=Integer.parseInt(s[2]);
            if(n==0&&m==0&&p==0){
                break;
            }
            int ans=0;
            int []g=new int [n];
            for(int i=0;i<n;i++){
                line=sc.nextLine();
                g[i]=Integer.parseInt(line);
                ans+=Integer.parseInt(line);
            }
if(g[m-1]!=0)
            System.out.println((ans*(100-p))/g[m-1]);
            else
System.out.println(0);
            line=sc.nextLine();
        }
    }
}
