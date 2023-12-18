 import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArray = new int[n];
        List<Long> list2 = new ArrayList<>();

        for(int i = 0;i < n;i++){
            nArray[i] = sc.nextInt();
        }
        int q = sc.nextInt();

        for(int i = 0;i < q;i++){
            int data = sc.nextInt();
            int change = sc.nextInt();
            Arrays.sort(nArray);
            for(int j = 0;j < nArray.length;j++){
                if(nArray[j] > data)
                    break;

                if(nArray[j] == data){
                    nArray[j] = change;
                }
            }
            
            list2.add(sum(nArray));
        }
        for(long ans : list2){
            System.out.println(ans);
        }
    }

    static long sum(int[] list){
        long sum = 0;
        for(int a : list)
            sum += a;
        
        return sum;
    }
}