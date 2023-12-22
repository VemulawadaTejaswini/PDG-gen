import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        int preH = 0;
        int x=0;
        int y=0;
        for(int i=0;i<N;i++){
            if(i==0){
                preH = H[i];
            }else{
                preH=H[i-1];
            }
            H[i]=sc.nextInt();
            if(preH<H[i]){
                x=0;
            }
            else{
                x=x+1;
                preH = H[i];
                if(x>y){
                    y=x;
                }
            }
        }
        System.out.println(y);
        sc.close();

        
        }
    }
