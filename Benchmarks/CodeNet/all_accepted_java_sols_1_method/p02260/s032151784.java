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

        for(int i=0; i < n; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(i != min){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                count++;
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