import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long x;
        long y;
        long s;
        long t;
        long z;
        long zz;
        long zzz;
        long zzzz;
        
        if(b<0 && d<0 ) {
        	z=a*c;
        } else if(a>0 && c>0) {
        	z=b*d;
        }else if(b<0 && c>0) {
        	z=b*c;
        }else if(a>0 && d<0) {
        	z=a*d;
        } else {
        	s=a*c;
        	t=b*d;
        	x=a*d;
        	y=b*c;
        	zz=Math.max(s,t);
        	zzz=Math.max(zz,x);
        	zzzz=Math.max(zzz,y);
        	z=Math.max(zzzz, 0);
        }
        
        System.out.println(z);
        

    }
}
