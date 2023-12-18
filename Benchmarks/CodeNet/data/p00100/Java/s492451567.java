import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                do{ 
                        long[][] data = new long[4000][2];
                        for(int i = 0 ; i < n ; i++){
                                imput(data, sc.nextInt(), sc.nextInt(), sc.nextInt());
                        }   
                        boolean NA = true;
                        for(int i = 0 ; i < 4000 ; i++){
                                if(data[i][1] >= 1000000){
                                        System.out.println(data[i][0]);
                                        NA = false;
                                }   
                        }   
                        if(NA) System.out.println("NA");
                        n = sc.nextInt();
                }while(n > 0); 
        }   
        static void imput(long[][] source, int num, int sales, int price){
                for(int i = 0 ; i < 4000 ; i++){
                        if(source[i][0] == num){
                                source[i][1] += (long)sales*price;
                                return;
                        }else if(source[i][0] == 0){ 
                                source[i][0] = num;
                                source[i][1] += (long)sales*price;
                                return;
                        }   
                }   
        }   
}