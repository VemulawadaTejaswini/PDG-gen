import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        StringBuilder bld = new StringBuilder();
        for(int i=0;i<N*2;i++){
            if(i % 2 == 0){
                bld.append(S.charAt(i/2));
            }else{
                bld.append(T.charAt(i/2));
            }
        }
        System.out.println(bld.toString());
    }
}
