public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,c=0;
        while (true){
            a = sc.nextInt();
            for(int i=0;i<a/2;i++){
                if((2*i+1)==a){
                    c++;
                }
            }
            System.out.println(c);
        }

    }
}

