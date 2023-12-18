import java.util.Scanner;

class Main {

    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        int ans = 0;

        while (sc.hasNextInt()) 
            if (isPrime(sc.nextInt())) 
                ans++;
            
        System.out.println(ans);
    }
}

