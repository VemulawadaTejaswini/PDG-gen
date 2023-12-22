import java.util.Scanner;
class Main{
    int n,x,y=0,z=0;
    boolean a;
    String b;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        while(a == false){
            n = sc.nextInt();
            x = sc.nextInt();
            if(n == 0 && x == 0){
                a = true;
                break;
            }
            for(int s1 = 1;s1 <= n-2; s1++){
                for(int s2 = s1+1;s2 <= n-1; s2++){
                    for(int s3 = s2+1;s3 <= n; s3++){
                        if(s1 + s2 + s3 == x){
                            z++;
                        }
                    }
                }
            }
            System.out.println(z);
            z = 0;
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}