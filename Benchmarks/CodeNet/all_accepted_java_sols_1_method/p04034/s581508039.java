import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] box = new int[n+1];
        boolean[] flag = new boolean[n+1];
        for(int i = 1; i < n+1; i++){
            box[i] = 1;
            flag[i] = false;
        }
        flag[1] = true;
        for(int i = 0; i < m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(flag[x] && box[x] == 1){
                flag[x] = false;
                flag[y] = true;
            }else if(flag[x] && box[x] > 1){
                flag[y] = true;
            }
            box[x]--;
            box[y]++;
        }
        int count = 0;
        for(int i = 0; i < n+1; i++){
            if(flag[i])
                count++;
        }
        System.out.println(count);
    }
}
