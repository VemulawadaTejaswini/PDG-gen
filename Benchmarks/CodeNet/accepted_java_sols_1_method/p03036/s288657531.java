import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        int r=sc.nextInt();
        int D=sc.nextInt();
        
        int[] x=new int[11];
        x[0]=sc.nextInt();
        
        for(int i=1;i<x.length;i++) {
        	x[i]=(r*x[i-1])-D;
        }
        
        for(int j=1;j<x.length;j++) {
        	System.out.println(x[j]);
        }
        
        sc.close();
    }
}