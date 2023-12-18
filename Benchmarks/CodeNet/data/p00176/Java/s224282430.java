import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c= {"black","blue","lime","aqua","red","fuchsia","yellow","white"};
        for (;;) {
            String n = sc.next();
            if (n.equals("0")) {
                break;
            }
            int[] l=new int[6];
            for(int i=1;i<7;i++) {
                if(n.charAt(i)>='a'&&n.charAt(i)<='f') {
                    l[i-1]=n.charAt(i)-'a'+10 ; 
                }else {
                    l[i-1]=n.charAt(i)-'0'; 
                }
            }
            int r=l[0]*16+l[1]>127?4:0;
            int g=l[2]*16+l[3]>127?2:0;
            int b=l[4]*16+l[5]>127?1:0;
            System.out.println(c[r+g+b]);
        }
    }
}
