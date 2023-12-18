class gcd {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
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