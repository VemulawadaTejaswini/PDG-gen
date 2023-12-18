import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[555];
        int[] b=new int[555];
        int[] c=new int[555];
        int m=0;
        while(true){
            a[m]=scan.nextInt();
            b[m]=scan.nextInt();
            c[m]=scan.nextInt();
            if(a[m]==-1&&b[m]==-1&&c[m]==-1) break;
            m++;
        }
        m=0;
        while(true){
            if(a[m]==-1||b[m]==-1) System.out.println("F");
            else if(a[m]+b[m]>=80) System.out.println("A");
            else if(a[m]+b[m]>=65) System.out.println("B");
            else if(a[m]+b[m]>=50) System.out.println("C");
            else if(a[m]+b[m]>=30){
                if(c[m]>=50) System.out.println("C");
                else System.out.println("D");
            }
            else System.out.println("F");
            m++;
            if(a[m]==-1&&b[m]==-1&&c[m]==-1) break;
        }
    }
}
