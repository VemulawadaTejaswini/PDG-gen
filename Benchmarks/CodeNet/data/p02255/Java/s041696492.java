import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.nextLine();
        int[] num = new int[n];
        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
        } 

        int tmp,j;
        for(int i = 0;i < n;i++){
            tmp = num[i];
            j = i - 1;
            while(j >= 0 && num[j] > tmp){
                num[j + 1] = num[j];
                j--;
                num[j + 1] = tmp;
            }
            for(int k = 0;k < n;k++){
                if(k != 0)  System.out.print(" ");
                System.out.print(num[k]);
            }
            System.out.println("");
        }
    }
}
