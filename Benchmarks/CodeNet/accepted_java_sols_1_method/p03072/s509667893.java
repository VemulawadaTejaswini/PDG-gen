import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] mount = new int[N];
        
        for(int i = 0 ; i < N ; i++){
            mount[i] = sc.nextInt();
        }
        
        int cnt = 1;
        int max = 0;
        
        for(int m = 1 ; m < N ; m++){
            if((mount[0] <= mount[m]) && max <= mount[m]){
                cnt += 1;
                if(max < mount[m]) {
                	max = mount[m];
                }
            }
        }
        System.out.println(cnt);
    }
}