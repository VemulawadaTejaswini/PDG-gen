import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int [N];
        int [] count = new int [9];
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(a[i]<400){
                count[0]++;
            }else if(a[i]<800){
                count[1]++;
            }else if(a[i]<1200){
                count[2]++;
            }else if(a[i]<1600){
                count[3]++;
            }else if(a[i]<2000){
                count[4]++;
            }else if(a[i]<2400){
                count[5]++;
            }else if(a[i]<2800){
                count[6]++;
            }else if(a[i]<3200){
                count[7]++;
            }else{
                count[8]++;
            }
        }
        
        int color = 0;
        for(int i=0; i<8; i++){
            if(count[i]>0){
                color++;
            }
        }
        
        int min = color;
        int max = count[8]+color;
        
        if(color == 0){
        System.out.println(1+" "+max);
        }else{
        System.out.println(min+" "+max);    
        }
    }
}