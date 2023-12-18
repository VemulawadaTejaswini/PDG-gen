public class gcd {
    public static void main(String[] args) {
        Scanner scon = new Scanner(System.in);
        int a = scon.nextInt();
        int b = scon.nextInt();
        int gcd = 1;
        for (int i = 1; i < a; i++){
            if (a%i == 0){
                if (b % i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.print(gcd);
    }
}