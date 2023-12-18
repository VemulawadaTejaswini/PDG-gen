import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
           String[] s=sc.next().split(":");
           double c=Math.abs(Double.parseDouble(s[0])*60-Double.parseDouble(s[1])*11)/2;
           double d=Math.min(c,360-c);
           System.out.println(d<30?"alert":d<90?"warning":"safe");
        }
    }
}
