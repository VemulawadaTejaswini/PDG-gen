import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w,n,i,temp;
        int[] num;
        String line;

        w=scan.nextInt();
        n=scan.nextInt();
        num = new int[w];
        for(i=0;i<w;i++){
            num[i]=i+1;
        }

        for(i=0;i<n;i++){
            line=scan.next();
            String[] ab = line.split(",");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            temp=num[a-1];
            num[a-1]=num[b-1];
            num[b-1]=temp;
        }

        for(i=0;i<w;i++){
            System.out.println(num[i]);
        }

    }
}
