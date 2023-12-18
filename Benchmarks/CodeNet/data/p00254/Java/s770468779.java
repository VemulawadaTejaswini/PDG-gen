import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            char[] l=sc.next().toCharArray(),a=new char[4];
            if(d(l)==0) {
                break;
            }
            if(d(l)%1111==0) {
                System.out.println("NA");
                continue;
            }
            int c=0;
            while (d(l)!=6174) {
                Arrays.sort(l);
                for(int i=0;i<4;i++) {
                    a[i]=l[3-i];
                }
                char[] r=String.valueOf(d(a)-d(l)).toCharArray();
                for(int i=0,j=0;i<4;i++) {
                    l[i]=i<4-r.length?'0':r[j++];
                }
                c++;
            }
            System.out.println(c);
        }
    }
    static int d(char[] c) {
        return Integer.parseInt(new String(c));
    }
}

