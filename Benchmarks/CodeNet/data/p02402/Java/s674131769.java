import java.util.Scanner;
class Main{
    int n,i;
    int max = -999999999;
    int min = 999999999;
    int sum = 0;

    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
            sum += a[i];
            if(n == 0){
                min = 0;
                max = 0;
            }else if(n == 1){
                max = a[i];
                min = a[i];
            }else if(min > a[i]){
                min = a[i];
            }else if(max <= a[i]){
                max = a[i];
            }else{
                continue;
            }
           
        }
    System.out.println(min + " " + max + " " + sum);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}