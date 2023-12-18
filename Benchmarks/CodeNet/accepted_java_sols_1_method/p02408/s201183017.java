import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[13];
        int[] c = new int[13];
        int[] h = new int[13];
        int[] d = new int[13];
        for(int i=0;i<n;i++){
            String str = sc.next();
            int a = sc.nextInt();
            if(str.equals("S")) s[a-1] = 1;
            if(str.equals("C")) c[a-1] = 1;
            if(str.equals("H")) h[a-1] = 1;
            if(str.equals("D")) d[a-1] = 1;  
        }
        for(int i=0;i<13;i++){
            if(s[i]!=1) System.out.println("S "+(i+1));
        }
        for(int i=0;i<13;i++){
            if(h[i]!=1) System.out.println("H "+(i+1));
        }
        for(int i=0;i<13;i++){
            if(c[i]!=1) System.out.println("C "+(i+1));
        }
        for(int i=0;i<13;i++){
            if(d[i]!=1) System.out.println("D "+(i+1));
        }
        sc.close();
    }
}
