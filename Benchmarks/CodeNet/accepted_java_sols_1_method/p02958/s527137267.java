import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int num[] = new int[n];
        for (int i=0; i<n; i++) num[i] = i+1;

        int count = 0;

        for (int i=0; i<n; i++){
            if (arr[i]!=num[i]){
                count++;
            }
        }
        if ((count==0) || (count==2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
