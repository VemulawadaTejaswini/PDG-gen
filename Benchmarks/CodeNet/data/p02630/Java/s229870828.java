 import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            list2.add(num1);
            list2.add(num2);
        }

        Iterator<Integer> ite = list2.iterator();
        while(ite.hasNext()){
            int sum = 0;
            int data = ite.next();
            int change = ite.next();
            for(int j = 0;j < list.size();j++){
                int num = list.get(j);
                if(num == data){
                    list.set(j,change);
                }
                sum += list.get(j);
            }
            System.out.println(sum);
        }
    }
}