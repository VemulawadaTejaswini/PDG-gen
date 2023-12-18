import java.util.Scanner;
 
class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] prime = new int[999999];
        prime[0] = 2;
        int num = 1;
        while(s.hasNext()){
            int n = s.nextInt();
            if (prime[num-1] > n){
                int out = 0;
                for(int i=0; ; i++){
                    if(prime[i] > n){
                        out = i;
                        break;
                    }
                }
                System.out.println(out);
            }else{
                for (int i=prime[num-1]+1 ; i<=n ; i++){
                    boolean flag = true;            
                    for (int j=0 ; j < (num-1) ; j++){
                        if(i % prime[j] == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        prime[num] = i;
                        num++;
                    }
                }        
            System.out.println(num);    
            }
        }
    }
}