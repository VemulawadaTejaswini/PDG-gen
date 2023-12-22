import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] strs = sc.nextLine().split(" ");
        int min = 1000000000;
        for (String str : strs) {
            int result = countDiv(Integer.valueOf(str));
            if(min > result){
                min = result;
            }
            if(result == 0){
            	break;
            }
        }
        System.out.println(min);
        
        
        sc.close();
    }

    public static int countDiv(int i){
        if(i == 0) {
            return 0;
        }
        int cnt=0;
        while(i%2 == 0) {
          	i = i/2;
            cnt++;
        }
        return cnt;
    }
}