import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h,w;

        while(true){
            int count = 0;

            h = scanner.nextInt();
            w = scanner.nextInt();

            if (h == 0 && w == 0){
                break;
            }

            for(int j = 0;j < h;j++){
              count = j % 2;
                for(int i =0; i < w;i++){
                    count++;
                    if(count%2 == 1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

