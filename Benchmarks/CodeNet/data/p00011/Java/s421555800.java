import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] w = new int[num];
        for(int i=0;i<w.length;i++){
            w[i]=i+1;
        }
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            int tmp1=sc.nextInt();
            int tmp2=sc.nextInt();
            int tmp3;
            tmp3=w[tmp1-1];
            w[tmp1-1]=w[tmp2-1];
            w[tmp2-1]=tmp3;
        }
        for(int i=0;i<w.length;i++){
            System.out.println(w[i]);
        }
    }
}

