import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] pricelist = new int[n];

        for(int i = 0;i < n;i++){
            pricelist[i] = sc.nextInt();
        }

        Arrays.sort(pricelist);

        pricelist[n-1] /= 2;

        int result = 0;
        for(int i = 0;i < pricelist.length;i++){
            result += pricelist[i];
        }

        System.out.println(result);
    }
}