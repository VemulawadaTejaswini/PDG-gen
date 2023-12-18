import java.util.*;

class Main {
        public static void main(String args[]) {
                try(Scanner sc = new Scanner(System.in)){
                        int A = sc.nextInt(),
                            B = sc.nextInt(),
                            C = sc.nextInt(),
                            D = sc.nextInt(),
                            E = sc.nextInt();
                        int ans = 0;
                        for(int i = A; i < B; i++){
                                if(i <= 0){
                                        ans += C;
                                }
                                if(i >= 0){
                                        ans +=E;
                                }
                                if(i==0 && A != 0){
                                        ans += C;
                                }
                        }
                        System.out.println(ans);
                }
        }
}