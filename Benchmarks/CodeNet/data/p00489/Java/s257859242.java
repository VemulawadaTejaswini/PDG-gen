import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//0566
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),s[] =new int[n];
        T[] t=new T[n];
        for (int i = 0; i < n * (n - 1) / 2; i++) {
            int a = sc.nextInt()-1, b = sc.nextInt()-1, c = sc.nextInt(), d = sc.nextInt();
            if (c == d) {
                s[a]++;
                s[b]++;
            } else if (c > d) {
                s[a] += 3;
            } else {
                s[b]+=3;
            }
        }
        for(int i=0;i<n;i++)
            t[i]=new T(i+1,s[i]);
        Arrays.sort(t, new Comparator<T>() {
            public int compare(T a, T b) {
                return b.s-a.s;
            }
        });
        t[0].r=1;
        for(int i=1;i<n;i++) {
            if(t[i].s==t[i-1].s)
                t[i].r=t[i-1].r;
            else
                t[i].r=i+1;
        }
        Arrays.sort(t, new Comparator<T>() {
            public int compare(T a, T b) {
                return a.i-b.i;
            }
        });
        for(T e:t) {
            System.out.println(e.r);
        }
    }
}
class T{
    int i;
    int s;
    int r;
    T(int i,int s){
        this.i=i;
        this.s=s;
    }
}
