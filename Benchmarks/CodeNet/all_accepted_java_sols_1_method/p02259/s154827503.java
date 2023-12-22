import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        boolean flag = true;
        int count = 0;
        while(flag){
            flag = false;
            for(int j = n-1; j >= 1; j--){
                if(a[j] < a[j-1]){
                    int x = a[j];
                    a[j] = a[j-1];
                    a[j-1] = x;
                    flag = true;
                    count++;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(System.lineSeparator());
        sb.append(count);
        
        System.out.println(sb);
    }
}
