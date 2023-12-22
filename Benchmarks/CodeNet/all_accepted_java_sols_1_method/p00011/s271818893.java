import java.util.Scanner;

public class Main{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[]  tate = new int[w];
        for(int i=0;i<w;i++) {
        	tate[i]=i+1;
        }
        int[]   a   = new int[n];
        int[]   b   = new int[n];
        for(int i=0;i<n;i++){
        	str = sc.next();
        	String[] input = str.split(",");
            a[i]= Integer.parseInt(input[0]);
            b[i]= Integer.parseInt(input[1]);
            int t=tate[a[i]-1];
            tate[a[i]-1]=tate[b[i]-1];
            tate[b[i]-1]=t;
        }

        for(int i=0;i<w;i++){
            System.out.println(tate[i]);
        }
        sc.close();
    }
}
