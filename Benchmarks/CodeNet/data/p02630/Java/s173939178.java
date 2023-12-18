import java.util.*;
class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       List<Integer> list = new ArrayList<>();
       List<Long> list2 = new ArrayList<>();

       for(int i = 0;i < n;i++){
           list.add(sc.nextInt());
       }
       
       int q = sc.nextInt();

       for(int i = 0;i < q;i++){
           int data = sc.nextInt();
           int change = sc.nextInt();
           if(!list.contains(data)){
                list2.add(sum(list));
                continue;
           }
           for(int j = 0;j < list.size();j++){
               if(list.get(j) == data){
                   list.set(j,change);
               }
           }
           list2.add(sum(list));
       }
       for(long ans : list2){
           System.out.println(ans);
       }
   }

   static long sum(List<Integer> a){
       long sum = 0;
       for(long num : a){
           sum += num;
       }
       return sum;
   }
}
