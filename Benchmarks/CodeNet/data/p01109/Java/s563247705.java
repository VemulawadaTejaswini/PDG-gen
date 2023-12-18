import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            int num ;
            int sum = 0;
            double ave = 0;
            int count = 0;
            num = in.nextInt();
            if(num == 0) break;
            int [] a = new int [num];
            for(int i = 0; i < a.length; i++){
                a[i] = in.nextInt();
                sum += a[i];
            }
            ave = sum/num;
    
            for(int i = 0; i < a.length ;i++){
                if(a[i] <= ave) count++;
            }
            System.out.println(count);
        }
    }
}
