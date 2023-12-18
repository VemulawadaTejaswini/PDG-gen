import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] point = new int[n];

        for(int i = 0;i < q;i++){
            point[sc.nextInt()-1]++;
        }
        
        for(int i = 0;i < n;i++){
            if(k-q+point[i] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}