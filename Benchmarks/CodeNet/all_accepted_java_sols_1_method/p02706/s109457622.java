import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int sum = 0;
        for(int i = 0; i< arr.length ; i++){
            sum += Integer.parseInt(arr[i]);
        }
        if(n - sum >= 0){
            System.out.println(n-sum);
        }else{
            System.out.println(-1);
        }
    }

}
