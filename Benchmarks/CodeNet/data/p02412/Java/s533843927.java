import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            if(n==0 && x==0){
                break;
            }else{
                com(n,x);
            }
        }
    }
    static void com(int n,int x){
        int count=0;
       for(int i=1; i<n; i++){
            for(int j=2; j<n; j++){
                for(int k=3; k<=n; k++){
                	// 重複なし(同一数字)
                    if(i!=j && j!=k && i!=k){
                    	// 重複なし(同じパターン)
                        if(i<j && j<k){
                            if((i+j+k) == x) count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
