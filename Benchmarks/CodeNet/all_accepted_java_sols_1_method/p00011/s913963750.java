import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        String[] data=new String[w];
        for(int i=0;i<n;i++)data[i]=sc.next();
        int[] ans=new int[w];
        for(int i=0;i<w;i++)ans[i]=i+1;
        for(int i=0;i<n;i++){
            String[] str=data[i].split(",",0);
            int swap;
            int a=Integer.valueOf(str[0]);
            int b=Integer.valueOf(str[1]);
            swap=ans[a-1];
            ans[a-1]=ans[b-1];
            ans[b-1]=swap;
        }
        for(int i=0;i<w;i++)System.out.println(ans[i]);
        sc.close();
    }
}
