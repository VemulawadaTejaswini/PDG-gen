import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[w];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        for(int j=0;j<n;j++){
            String str=sc.next();
            String[] bc=str.split(",");
            int b=Integer.parseInt(bc[0])-1;
            int c=Integer.parseInt(bc[1])-1;
            int x=a[b];
            a[b]=a[c];
            a[c]=x;
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
