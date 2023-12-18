import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
           String[] s=sc.next().split(":");
           int c=Math.abs(Integer.parseInt(s[0])*120-Integer.parseInt(s[1])*22);
           //double d=Math.min(c,360-c);
           //System.out.println(d<30?"alert":d<90?"warning":"safe");
           System.out.println(c<60||c>660?"alert":c<180||c>540?"warning":"safe");
        }
    }
}
