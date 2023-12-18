import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int j;
        int count = 0;
        int flag = 1;
        while(flag==1){
            flag = 0;
        for(j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                int tmp;
                tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
                count++;
                flag = 1;
            }

        }    
        }
        System.out.printf("\n");
        for(i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
            System.out.println();
            System.out.printf("%d\n",count);
    }
}
