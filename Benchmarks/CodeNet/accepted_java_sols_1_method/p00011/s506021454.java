import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w1 = sc.nextInt();
        int[] w2 = new int[w1];
        for(int i=0;i<w1;i++){
            w2[i] = i+1;
        }
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] str2 = str.split(",");
            int a = Integer.parseInt(str2[0])-1;
            int b = Integer.parseInt(str2[1])-1;
            int tmp;
            tmp = w2[a];
            w2[a] = w2[b];
            w2[b] = tmp;
        }
        for(int i=0;i<w1;i++){
            System.out.println(w2[i]);
        }
    }
}
