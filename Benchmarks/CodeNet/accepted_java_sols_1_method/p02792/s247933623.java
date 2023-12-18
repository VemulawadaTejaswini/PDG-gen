import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        long sum = 0;
        //int min = 10000000;
        //int count = 0;
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int num[][] = new int[10][10];
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                num[i][j] = 0;
            }
        }
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 1; i <= n; i++){
            int kazu = i;
            int ue = 0;
            int shita = 0;
            
            while(true){
                if(kazu < 10){
                    ue = kazu;
                    break;
                }else{
                    kazu /= 10;
                }
            }
            
            kazu = i;
            
            shita = kazu % 10;
            
            //System.out.println(ue + " " +shita);
            
            num[ue][shita]++;
        }
        
        for(int i = 1; i < 10; i++){
            for(int j = i; j < 10; j++){
                if(num[i][j] >= 1 && num[j][i] >= 1){
                    if(i == j){
                        sum += num[i][j] * num[j][i];
                    }else{
                        sum += num[i][j] * num[j][i] * 2;
                    }
                }
                
                // if(i == j){
                //     sum += num[i][j];
                // }
                
                //System.out.println(i + " " + j + " " + sum);
            }
        }
        
        
        System.out.println(sum);
        //System.out.println();
        //System.out.print();
        
        //System.out.println(2425 % 10);
 
        stdIn.close();
    }
}