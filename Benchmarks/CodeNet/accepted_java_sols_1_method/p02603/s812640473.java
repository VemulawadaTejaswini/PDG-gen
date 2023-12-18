import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        var b = new int[n];
        for(int i = 1; i < n; i++){
            b[i] = a[i] - a[i-1];
        }
        long money = 1000;
        long stock = 0;
        for(int i = 0; i < n; i++){
            if(stock == 0){
                for(int j = i+1; j < n; j++){
                    if(b[j] < 0){
                        i = j-1;
                        break;
                    }
                    if(b[j] > 0){
                        long k = money / a[i];
                        money -= a[i] * k;
                        stock = k;
                        i = j-1;
                        break;
                    }
                }
            }else{
                for(int j = i+1; j < n; j++){
                    if(b[j] > 0){
                        i = j-1;
                        break;
                    }
                    if(b[j] < 0){
                        money += stock * a[i];
                        stock = 0;
                        i = j-1;
                        break;
                    }
                }
            }
        }
        money += stock * a[n-1];
        System.out.println(money);
    }
}