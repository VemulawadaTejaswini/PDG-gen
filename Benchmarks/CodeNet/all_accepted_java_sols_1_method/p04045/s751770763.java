import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        boolean Hate[] = new boolean[10];

        for(int i=0; i<D; i++){
            Hate[scan.nextInt()] = true;
        }

        int pay = N;
        while(true){
            int tmp = pay;
            while(tmp>0 && Hate[tmp % 10] == false) {
                tmp = tmp / 10;
            }
                if(tmp == 0){
                    break;
                }else{
                    pay++;
                }
            }
            System.out.println(pay);
        }
    }

