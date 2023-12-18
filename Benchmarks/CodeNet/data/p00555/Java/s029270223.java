import java.util.Scanner;
//0632
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), r = sc.nextInt(), count = 0, a[][] = new int[h+1][w+1], b[][] = new int[h+1][w+1];
        char[][] t=new char[h][w];
        for(int i=1;i<=h;i++) {
            t[i-1]=sc.next().toCharArray();
            for(int j=1;j<=w;j++) {
                if(t[i-1][j-1]=='#')continue;
                a[i][j]=a[i-1][j]+1;
                b[i][j]=b[i][j-1]+1;
                if(a[i][j]>=r)count++;
                if(b[i][j]>=r)count++;
            }
        }
        System.out.println(count);
    }
}
