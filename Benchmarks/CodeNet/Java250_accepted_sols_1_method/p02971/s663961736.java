import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int max = 0;
        int second = 0;
        int maxNum = 0;
        boolean multiMax = false;
        
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                second = max;
                max = a[i];
                maxNum = i;
                multiMax = false;
            }else if(a[i] == max){
                multiMax = true;
            }else if(a[i] > second){
                second = a[i];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        String br = System.lineSeparator();
        if(multiMax){
            for(int i = 0; i < n; i++){
                sb.append(max).append(br);
            }
        }else{
            for(int i = 0; i < n; i++){
                if(i == maxNum){
                    sb.append(second).append(br);
                }else{
                    sb.append(max).append(br);
                }
            }
        }
        
        System.out.println(sb);
    }
}