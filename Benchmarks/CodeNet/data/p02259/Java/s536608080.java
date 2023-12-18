import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] line = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int temp;
        int count = 0;
        for(int x = 0; x < n; x++){
            arr[x] = Integer.parseInt(line[x]);
        }

        for(int i = 0;i < n; i++){
            for(int j = n-1; j > i; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        for(int x = 0; x < n; x++){
            if(x == n-1){
                System.out.println(arr[x]);
            }else{
                System.out.print(arr[x]);
                System.out.print(" ");
            }
        }
        System.out.println(count);
    }
}