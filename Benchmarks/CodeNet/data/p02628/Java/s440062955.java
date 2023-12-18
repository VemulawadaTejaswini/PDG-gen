 import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        Collections.sort(list);
        int sum = 0;
        for(int i = 0;i < k;i++){
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}