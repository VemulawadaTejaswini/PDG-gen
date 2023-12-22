import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int[] count = new int[2019];
        for(int i=l;i<l+4038 && i<=r;i++){
            count[i%2019]++;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<2019;i++){
            if(count[i]>1){
                min = Math.min(min,(i*i)%2019);
            }
            if(count[i] > 0){
                for(int j=i+1;j<2019;j++){
                    if(count[j] >0){
                        min = Math.min(min,(i*j)%2019);
                    }
                }
            }
        }
        System.out.println(min);
        sc.close();
    }

}