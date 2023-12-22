import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int num[],c,i,n,w;
        w = sc.nextInt();
        n = sc.nextInt();

        num = new int[30];

        for(i=0;i<w;i++) num[i] = i + 1;

        for (i=0;i<n;i++){
            String str = sc.next();
            String[] ab = str.split(",");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            c = num[a];
            num[a] = num[b];
            num[b] = c;
	}

        for(i=0;i<w;i++) System.out.printf("%d\n",num[i]);

    }
}