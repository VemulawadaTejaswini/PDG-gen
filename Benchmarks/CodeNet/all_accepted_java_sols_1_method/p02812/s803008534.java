import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        /*
        int count = 0;

        for(int i=0; i<N-2; i++) {
            if(S.charAt(i) == 'A'){
                if(S.charAt(i+1) == 'B') {
                    if(S.charAt(i+2) == 'C') {
                        count++;
                        i += 2;
                    }
                }
            }
        }*/

        //賢い方法
        int count = (N - S.replace("ABC", "").length()) / 3;

        System.out.println(count);
        
    }
}