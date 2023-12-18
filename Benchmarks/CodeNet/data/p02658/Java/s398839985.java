import java.util.*;


class Main {
    private static Scanner sc;


    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        Long A = sc.nextLong(),ans = (long) 1;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            list.add(sc.nextLong());
        }
        for(Long a:list) ans *= a;
        if(ans <= Math.pow(10, 17)){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}






