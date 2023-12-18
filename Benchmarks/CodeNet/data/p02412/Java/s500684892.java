import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] inputs = scan.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int x = Integer.parseInt(inputs[1]);
        int num = 0;

        int i = 1;
        int j = i + 1;
        int k = j + 1;

        while (i+j+k <= x){
            while(k <= n){
                if (i+j+k == x){
                    num += 1;
                    break;
                }else if (i+j+k > x){
                    break;
                }
                k += 1;
            }
            j += 1;
            k = j + 1;
           
            if (k > n || i+j+k > x){
                i += 1;
                j = i + 1;
                k = j + 1;
            }
        }
        System.out.println(num);
    }
}