import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x, y = 0;
        for(int i = 0; i<str.length(); i++) {
            x = -1;
            y = -1;
            boolean isR = true;
            while(i<str.length()) {
                char c = str.charAt(i);
                if(c=='R' && !isR) {
                    i--;
                    break;
                }
                if(c=='L') {
                    isR = false;
                    y++;
                }
                if(c=='R') {
                    x++;
                }
                i++;
            }
            for(int j = 0; j<x; j++) System.out.print("0 ");
            System.out.print((1+x/2+(int)Math.ceil((double)y/(double)2))+" "+(1+y/2+(int)Math.ceil((double)x/(double)2))+" ");
            for(int j = 0; j<y; j++) System.out.print("0 ");
        }
        System.out.println();

    }
}