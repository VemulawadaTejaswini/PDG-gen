import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                for(int i = 0 ; i < t ; i++){
                        int n = sc.nextInt();
                        int k = sc.nextInt();
                        int[] x = new int[n];
                        for(int j = 0; j < n ; j++){
                                x[j] = sc.nextInt();
                        }   
                        int[] d = new int[n-1];
                        for(int j = 0 ; j < n-1; j++){
                                d[j] = x[j+1]-x[j];
                        }   
                        Arrays.sort(d);
                        int sum = 0;
                        for(int j = 0; j < n-k; j++){
                                sum += d[j];
                        }   
                        System.out.println(sum);
                }   
                sc.close();
        }   
}