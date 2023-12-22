import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(),ans1 = 0,ans2 = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < A; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        if(A % 2 == 0) {
            while (A >= 1) {
                ans1 += list.get(A - 1);
                ans2 += list.get(A - 2);
                A -= 2;
            }
        }else{
            while(A >= 0){
                ans1 += list.get(A-1);
                if(A == 1){
                    break;
                }
                ans2 += list.get(A-2);
                A -= 2;
            }
        }
        System.out.println(ans1-ans2);
    }
}
