import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        int sum=0;
        while (true) {
            n = sc.nextInt();
            x = sc.nextInt();
            if(n==0 && x==0){
                break;
            }
            int[] num;
            num = new int[n];
            int count;
            for(count=0;count<n;count++){
                num[count] = count + 1;
            }
            int i,j,k;
            for(i=0;i<n-2;i++){
                for(j=i+1;j<n-1;j++){
                    for(k=j+1;k<n;k++){
                        if(num[i]+num[j]+num[k] == x){
                            sum++;
                        }
                    }
                }
            }
        System.out.println(sum);
        sum = 0; 
        }
        sc.close();
    }
}
