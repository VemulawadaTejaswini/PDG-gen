import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(),r=sc.nextInt(),count=0;
        char[][] m=new char[h][w];
        for (int i = 0; i < h; i++) {
            m[i]=sc.next().toCharArray();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                count+=getCountH(i,j,r,h,m);
                count+=getCountW(i,j,r,w,m);
            }
        }
        System.out.println(count);
    }
    static int getCountH(int i,int j,int r,int l,char[][] m) {
        if(i+r>l)return 0;
        for(int k=i;k<i+r;k++) {
            if(m[k][j]=='#') {
                return 0;
            }
        }
        return 1;
    }
    static int getCountW(int i,int j,int r,int l,char[][] m) {
        if(j+r>l)return 0;
        for(int k=j;k<j+r;k++) {
            if(m[i][k]=='#') {
                return 0;
            }
        }
        return 1;
    }
}
