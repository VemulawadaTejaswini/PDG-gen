public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1; ;i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int pin =  1;

            if(h==0&&w==0) break;

            for(int n = 0; n < h ; n++){
                for(int m = 0; m < w; m++){
                    if (pin%2 == 1)System.out.print("#");
                    if (pin%2 == 0)System.out.print(".");
                    pin ++;
                    if(m == w-1)System.out.println();
                }
            }
            System.out.println();
        }
    }
}
