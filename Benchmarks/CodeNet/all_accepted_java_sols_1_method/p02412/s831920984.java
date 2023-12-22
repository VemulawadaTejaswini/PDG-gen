import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int x = scanner.nextInt(); 
        while(n != 0 || x !=0){
            int cnt = 0;
            int i, j, k;
            for(i=1; i<=n; i++){
                for(j=i+1; j<=n; j++){
                    for(k=j+1; k<=n; k++){
                        if(i + j + k == x){
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
                    
            n = scanner.nextInt();
            x = scanner.nextInt();
        }
        

    }
}
