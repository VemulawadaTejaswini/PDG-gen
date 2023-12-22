import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int tScore = 0;
        int hScore = 0;

        for(int i = 0; i < n; i++){
            String taro = scanner.next().toLowerCase();
            String hana = scanner.next().toLowerCase();

            if(taro.equals(hana)){
                tScore++;
                hScore++;
            }else{
                char[] tCh = taro.toCharArray();
                char[] hCh = hana.toCharArray();

                int min = tCh.length < hCh.length ? tCh.length : hCh.length;
                int index = 0;
               do{
                   if(index == min){
                       if(tCh.length > hCh.length){
                           tScore += 3;
                       }else {
                           hScore += 3;
                       }
                       break;
                   }else if(tCh[index] == hCh[index]){
                        index++;
                    }else if(tCh[index] > hCh[index]){
                        tScore += 3;
                        break;
                    } else if (tCh[index] < hCh[index]) {
                        hScore += 3;
                        break;
                    }


                }while(index <= min);
            }

        }

        System.out.printf("%d %d\n", tScore, hScore);

        scanner.close();
    }
}

