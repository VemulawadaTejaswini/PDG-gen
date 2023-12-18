import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            int n=sc.nextInt();
            int r=sc.nextInt();
            /*System.out.println("n="+n+" r="+r);*/
            if(n==0&&r==0)break;
            
            int[] a=new int[n];
            /*System.out.print("a["+n+"]:");*/
            for(int i=0;i<n;i++){
                a[i]=i+1;
                /*System.out.print(a[i]);*/
            }
            /*System.out.println("");*/
            
            for(int i=0;i<r;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                /*System.out.println("p="+p+" c="+c);*/
                if(p<2) continue;
                
                int[] b=new int[c];
                /*System.out.print("b["+c+"]:");*/
                for(int j=0;j<c;j++){
                    b[j]=a[n-p-c+1+j];
                    /*System.out.print(b[j]);*/
                }
                /*System.out.println("");*/
                
                /*System.out.print("a["+n+"]:");
                for(int j=0;j<n;j++){
                    System.out.print(a[j]);
                }
                 System.out.print("->");*/
                for(int j=0;j<p-1;j++){
                    a[n-p-c+1+j]=a[n-p+1+j];
                }
               
                /*for(int j=0;j<n;j++){
                    System.out.print(a[j]);
                }
                System.out.print("->");*/
                for(int j=0;j<c;j++){
                    a[n-c+j]=b[j];
                }
                /*for(int j=0;j<n;j++){
                    System.out.print(a[j]);
                }
                System.out.println("");*/
            }
            System.out.println(a[n-1]);
        }
    }
}
