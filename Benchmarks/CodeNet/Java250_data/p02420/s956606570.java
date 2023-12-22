import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] moji;
        moji = new String[200];
        String[] copy;
        copy = new String[200];
        int[] m;
        m = new int[100];
        int[][] h;
        h = new int[100][100];

        int cnt=0;
        while(true){
            moji[cnt] = sc.next();
            if(moji[cnt].equals("-"))
                break;
            m[cnt] = sc.nextInt();
            for(int i=0;i<m[cnt];i++)
                h[cnt][i] = sc.nextInt();

            for(int i=0;i<m[cnt];i++){
                if(i==0)
                    copy[cnt] = moji[cnt].substring(h[cnt][i]) + moji[cnt].substring(0, h[cnt][i]);
                else
                    copy[cnt] = copy[cnt].substring(h[cnt][i]) + copy[cnt].substring(0, h[cnt][i]);
            }
            cnt++;        
        }

        for(int i=0; i<cnt; i++){
            System.out.println(copy[i]);
        }

        sc.close();

    }
}
