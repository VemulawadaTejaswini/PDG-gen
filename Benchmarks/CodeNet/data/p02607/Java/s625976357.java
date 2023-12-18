import java.util.Scanner;

//クラス名は必ずMainにする必要があります。



public class Main {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int num = 0;
        for(int i = 0; i < n; i++){
            int res = Integer.parseInt(sc.next());
            if(i % 2 == 0){
                if(res % 2 == 1){
                    num++;
                }
                
            }

        }
        System.out.println(num);
        
    }
    
}