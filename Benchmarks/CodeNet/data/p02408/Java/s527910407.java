import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] s = new boolean[13],h = new boolean[13],c = new boolean[13],d = new boolean[13];
        int n = sc.nextInt();
        for(int i = 0;i < n;++i){
            switch(sc.next()){
                case "S":
                    s[sc.nextInt() - 1] = true;
                    break;
                case "H":
                    h[sc.nextInt() - 1] = true;
                    break;
                case "C":
                    c[sc.nextInt() - 1] = true;
                    break;
                case "D":
                    d[sc.nextInt() - 1] = true;
                    break;
                default:
                    break;
            }
        }
        for(int i = 0;i < 13;++i){
            if(!s[i]) System.out.printf("S %d\n",i + 1);
        }
        for(int i = 0;i < 13;++i){
            if(!h[i]) System.out.printf("H %d\n",i + 1);
        }
        for(int i = 0;i < 13;++i){
            if(!c[i]) System.out.printf("C %d\n",i + 1);
        }
        for(int i = 0;i < 13;++i){
            if(!d[i]) System.out.printf("D %d\n",i + 1);
        }
    }

}