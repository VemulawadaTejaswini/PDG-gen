import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int m = stdIn.nextInt();
        int d = stdIn.nextInt();
        int count = 0;
        for(int i = 1;i<=m;i++) {
            for(int j = 10;j<=d;j++) {
                int j1 = j%10;
                int j2 = j/10;
             if(j1>=2 && j2>=2) {
                if(i == j1*j2) {
                    //System.out.println("i:"+i);
                    //System.out.println("j:"+j);
                    count++;
                }
            }
            }
        }
        System.out.println(count);
    }
}