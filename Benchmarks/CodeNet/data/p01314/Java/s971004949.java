public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        while (true){
            int c = 0;
            a = sc.nextInt();
            for(int i=0;i<a;i++){
                int sum=0;
                for(int j=i;j<a;j++) {
                    sum +=j;
                    if(sum==a) c++;
                }
            }
            System.out.println(c);
        }

    }
}

