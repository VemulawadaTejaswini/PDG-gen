import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
           String[] s=sc.next().split(":");
           int a=Integer.parseInt(s[0])*60;
           int b=Integer.parseInt(s[1]);
           int d=Math.abs((a+b)/2-b*6);
           System.out.println(d<30||d>330?"alert":d<90||d>270?"warning":"safe");
        }
    }
}
