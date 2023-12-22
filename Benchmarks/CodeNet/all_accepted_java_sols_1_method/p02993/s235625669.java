import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String[] N = sc.nextLine().split("");
        for(int i=0;i<3;i++){
            if(N[i].equals(N[i+1])){
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}