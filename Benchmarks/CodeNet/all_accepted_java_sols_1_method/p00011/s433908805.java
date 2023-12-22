import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] w = new int[num];
        for(int i=0;i<w.length;i++){
            w[i]=i+1;
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0])-1;
            int b = Integer.parseInt(ab[1])-1;
            int tmp;
            tmp=w[a];
            w[a]=w[b];
            w[b]=tmp;
        }
        for(int i=0;i<w.length;i++){
            System.out.println(w[i]);
        }
    }
}

