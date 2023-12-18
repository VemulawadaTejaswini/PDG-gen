import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(n != 0){ 
                        int max = sc.nextInt();
                        int sum = max;
                        for(int i = 1; i < n; i++){
                                int a = sc.nextInt();
                                sum = Math.max(sum+a, a); 
                                max = Math.max(sum, max);
                        }   
                        System.out.println(max);
                        n = sc.nextInt();
                }   
                sc.close();
        }   
}