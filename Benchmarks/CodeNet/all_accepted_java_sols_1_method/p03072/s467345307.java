import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -1,ans=0;
        for(int i=0;i<n;i++){
            int h = scanner.nextInt();
            if(max <= h){
                max = h;
                ans++;
            }
        }
        System.out.println(ans);
    }
}