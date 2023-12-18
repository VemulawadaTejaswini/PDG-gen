import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int n =s.nextInt();

//        int a = 2;
//        int n = 1_000_000_006;
//        int n = 50;
        int p = 1_000_000_007;


        long ans = pow(a,n,p);

        System.out.println(ans);

    }

static
    long pow(int a,int n,int p){

        if(n==1){
            return a;
        }
        if(n%2==0){
            long temp = pow(a,n/2,p);
            return temp*temp %p;
        }else{
            long temp = pow(a,n-1,p);
            return temp*a %p;
        }
    }

}
